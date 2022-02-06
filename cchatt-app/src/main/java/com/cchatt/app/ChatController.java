package com.cchatt.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ChatController {

    @Autowired
    private ChatImpl chatImpl;


    @RequestMapping(value = "/init/room" , method = RequestMethod.POST)
    @ResponseBody
    public String initRoom(@RequestParam("room") String room){

        return chatImpl.initRoom(room);

    }


    @RequestMapping(value = "/sendMessage" , method = RequestMethod.POST)
    @ResponseBody
    public String sendMessage(@RequestParam("messageObject") String messageObject) {
        return chatImpl.sendChat(messageObject);
    }


}
