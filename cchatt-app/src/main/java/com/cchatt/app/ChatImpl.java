package com.cchatt.app;

import com.google.gson.Gson;
import org.springframework.stereotype.Service;

@Service
public class ChatImpl implements IChat {

    @Override
    public String initRoom(String roomName) {

        return "OK";
    }

    @Override
    public String sendChat(String messageObj) {
        Gson gson = new Gson();
        ChatObj chatObj = gson.fromJson(messageObj, ChatObj.class);
        //save to  db


        //send to websocket



        return "OK";

    }
}
