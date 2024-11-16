package com.orbtech.core.services;

import android.Manifest;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

import androidx.core.app.ActivityCompat;

import com.orbtech.core.data.enums.ResponseType;
import com.orbtech.core.data.models.ResponseObj;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Set;
import java.util.UUID;

public class BluetoothService extends CoreService {
    private BluetoothSocket _socket;
    private OutputStream _outputStream;
    private InputStream _inputStream;
    private BluetoothDevice _connectedDevice;
    private BluetoothAdapter _bluetoothAdapter;

    int counter = 0;

    public BluetoothService(Activity activity) {
        super(activity);
    }

    public ResponseObj<Integer> connectToDevice(BluetoothDevice device) {
        UUID uuid = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB"); // SPP UUID
        ResponseObj<Integer> response = new ResponseObj<Integer>();
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                if (ActivityCompat.checkSelfPermission(context, Manifest.permission.BLUETOOTH_CONNECT) != PackageManager.PERMISSION_GRANTED) {
                    response = new ResponseObj<Integer>(ResponseType.ERROR);
                    return response;
                }
            }

            if (getConnectedDeviceAddress().equalsIgnoreCase(device.getName())) _socket = null;

            _socket = device.createRfcommSocketToServiceRecord(uuid);
            _socket.connect();
            _outputStream = _socket.getOutputStream();
            _inputStream = _socket.getInputStream();
        } catch (IOException ex) {
            if (counter < 5) {
                connectToDevice(device);
            }else {
                response = new ResponseObj<Integer>(ex);
            }
            counter++;
        }
        _connectedDevice = device;
        return response;
    }
    public ResponseObj<Integer> connectToDevice(String btMacAddress){
        ResponseObj<Integer> response = new ResponseObj<Integer>();
        if (_bluetoothAdapter.isEnabled()) {
            Set<BluetoothDevice> pairedDevices = _bluetoothAdapter.getBondedDevices();
            for (BluetoothDevice device : pairedDevices) {
                if (device.getAddress().equals(btMacAddress)) {
                    return connectToDevice(device);
                }
            }
        }
        response = new ResponseObj<Integer>(ResponseType.BLUETOOTH_ERROR, "Bluetooth cihazı bulunamadı");
        return  response;
    }

    public ResponseObj<Integer> sendData(String data) {
        ResponseObj<Integer> response = new ResponseObj<Integer>();
        try {
            if (!isConnected()) connectToDevice(_connectedDevice);
            _outputStream.write(data.getBytes());
        } catch (IOException ex) {
            response = new ResponseObj<Integer>(ex);
        }
        return response;
    }
    public ResponseObj<Integer> sendData(byte[] data) {
        ResponseObj<Integer> response = new ResponseObj<Integer>();
        try {
            if (!isConnected()) connectToDevice(_connectedDevice);
            _outputStream.write(data);
        } catch (IOException ex) {
            response = new ResponseObj<Integer>(ex);
        }
        return response;
    }
    public ResponseObj<Integer> sendData(byte data) {
        ResponseObj<Integer> response = new ResponseObj<Integer>();
        try {
            if (!isConnected()) connectToDevice(_connectedDevice);
            _outputStream.write(data);
        } catch (IOException ex) {
            response = new ResponseObj<Integer>(ex);
        }
        return response;
    }
    public ResponseObj<Integer> sendData(int data) {
        ResponseObj<Integer> response = new ResponseObj<Integer>();
        try {
            if (!isConnected()) connectToDevice(_connectedDevice);
            _outputStream.write(data);
        } catch (IOException ex) {
            response = new ResponseObj<Integer>(ex);
        }
        return response;
    }

    public ResponseObj<Integer> receiveData(Context context) {
        ResponseObj<Integer> response = new ResponseObj<Integer>();
        try {
            if (!isConnected()) connectToDevice(_connectedDevice);
            if (_inputStream == null) response = new ResponseObj<Integer>(ResponseType.BLUETOOTH_ERROR);
            response = new ResponseObj<Integer>(ResponseType.SUCCESS, String.valueOf(_inputStream.read()));
        } catch (IOException ex) {
            response = new ResponseObj<Integer>(ex);
        }
        return  response;
    }
    public ResponseObj<Integer> receiveData(int bufferSize) {
        ResponseObj<Integer> response = new ResponseObj<Integer>();
        String receivedMessage = "";
        try {
            if (!isConnected()) connectToDevice(_connectedDevice);
            if (_inputStream == null) response = new ResponseObj<Integer>(ResponseType.BLUETOOTH_ERROR, 0);
            for (int i = 0; i < bufferSize; i++) {
                receivedMessage += Integer.toHexString(_inputStream.read())+ " ";
            }
            response = new ResponseObj<Integer>(ResponseType.SUCCESS, receivedMessage);
        } catch (IOException e) {
            response = new ResponseObj<Integer>(ResponseType.BLUETOOTH_ERROR, 0);
        }
        return response;
    }

    private boolean closeConnection(Context context) {
        try {
            _socket.close();
        } catch (IOException e) {
            return false;
        }
        return true;
    }
    private boolean isConnected(){
        return _socket != null ? _socket.isConnected() : false;
    }

    private BluetoothDevice getConnectedDevice() {
        return _connectedDevice;
    }
    private String getConnectedDeviceAddress() {
        return _connectedDevice != null ? _connectedDevice.getAddress() : "";
    }


    private BluetoothAdapter getBluetoothAdapter() {
        return _bluetoothAdapter;
    }

    private void setBluetoothAdapter(BluetoothAdapter bluetoothAdapter) {
        _bluetoothAdapter = bluetoothAdapter;
    }
}
