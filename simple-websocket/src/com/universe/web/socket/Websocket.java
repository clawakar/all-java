package com.universe.web.socket;

import javax.enterprise.context.ApplicationScoped;

import java.util.HashSet;
import java.util.Set;

import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ApplicationScoped
@ServerEndpoint
	public class Websocket {
	    private final Set<Session> sessions = new HashSet<Session>();
	}
