package org.example.withSma.agents.containers;

import org.example.withSma.agents.MasterAgent;
import org.example.withSma.agents.QAgent;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.StaleProxyException;

import static org.example.withSma.agents.QLUtils.NUMBER_OF_AGENTS;

public class SimpleContainer {
    public static void main(String[] args) throws StaleProxyException {
        Runtime runtime = Runtime.instance();
        ProfileImpl profile = new ProfileImpl();
        profile.setParameter(ProfileImpl.MAIN_HOST, "localhost");
        AgentContainer agentContainer = runtime.createAgentContainer(profile);
        agentContainer.createNewAgent("masterAgent", MasterAgent.class.getName(), new Object[]{}).start();
        for (int i = 0; i < NUMBER_OF_AGENTS; i++) {
            try {
                //Create a new agent with the name "agent" + i and pass on the stateI and stateJ arguments
                agentContainer.createNewAgent("agent" + i, QAgent.class.getName(), new Object[]{}).start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
/*
 */