# Q-learning_with_SMA_implementation

**What is Q-learning?**
Q-learning is a machine learning approach that enables a model to iteratively learn and improve over time by taking the correct action. Q-learning is a type of reinforcement learning.

With reinforcement learning, a machine learning model is trained to mimic the way animals or children learn. Good actions are rewarded or reinforced, while bad actions are discouraged and penalized.

With the state-action-reward-state-action form of reinforcement learning, the training regimen follows a model to take the right actions. Q-learning provides a model-free approach to reinforcement learning. There is no model of the environment to guide the reinforcement learning process. The agent -- which is the AI component that acts in the environment -- iteratively learns and makes predictions about the environment on its own.

Q-learning also takes an off-policy approach to reinforcement learning. A Q-learning approach aims to determine the optimal action based on its current state. The Q-learning approach can accomplish this by either developing its own set of rules or deviating from the prescribed policy. Because Q-learning may deviate from the given policy, a defined policy is not needed.

Off-policy approach in Q-learning is achieved using Q-values -- also known as action values. The Q-values are the expected future values for action and are stored in the Q-table.

Chris Watkins first discussed the foundations of Q-learning in a 1989 thesis for Cambridge University and further elaborated in a 1992 publication titled Q-learning.

**How does Q-learning work?**
Q-learning models operate in an iterative process that involves multiple components working together to help train a model. The iterative process involves the agent learning by exploring the environment and updating the model as the exploration continues. The multiple components of Q-learning include the following:

*Agents*. The agent is the entity that acts and operates within an environment.

*States*. The state is a variable that identifies the current position in an environment of an agent.

*Actions*. The action is the agent's operation when it is in a specific state.

*Rewards*. A foundational concept within reinforcement learning is the concept of providing either a positive or a negative response for the agent's actions.

*Episodes*. An episode is when an agent can no longer take a new action and ends up terminating.

*Q-values*. The Q-value is the metric used to measure an action at a particular state.

Here are the two methods to determine the Q-value:

Temporal difference. The temporal difference formula calculates the Q-value by incorporating the value of the current state and action by comparing the differences with the previous state and action.
Bellman's equation.
Mathematician Richard Bellman invented this equation in 1957 as a recursive formula for optimal decision-making. In the q-learning context, Bellman's equation is used to help calculate the value of a given state and assess its relative position. The state with the highest value is considered the optimal state.
Q-learning models work through trial-and-error experiences to learn the optimal behavior for a task. The Q-learning process involves modeling optimal behavior by learning an optimal action value function or q-function. This function represents the optimal long-term value of action a in state s and subsequently follows optimal behavior in every subsequent state.
![image](https://github.com/EmoNasr/Q-learning_with_SMA_implementation/assets/87880384/333f3b48-daaf-4f5a-9f92-be61b7c0d868)

