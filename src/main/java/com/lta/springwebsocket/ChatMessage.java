package com.lta.springwebsocket;

public class ChatMessage {

    private String sender;
    private String text;
    
	public String getSender() {
		return sender;
	}
	
	public void setSender(String sender) {
		this.sender = sender;
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
}