# Workflow-Based Model for Parallel and Distributed Processing
The contents of this repository contain the source code and utility scripts developed for the prototype and experimentation examples done during the writing of my master's thesis in the area of Computer Science and Engineering in the academic institution belonging to the Polytechnic of Lisbon, Instituto Superior de Engenharia de Lisboa (ISEL). 

The work done in this thesis is a contribution to finding answers to some open issues, proposing a workflow model with the following characteristics: 
- decentralization of control over the execution of multiple tasks in a workflow; 

- execution of a workflow with multiple iterations; 

- possibility of specifying replicas of a task to support load balancing; 

- encapsulation of tasks in containers, enabling their execution on multiple computing nodes; 

- flexible specification of workflows independently of the technological infrastructure for its execution.


The prototype for experimentation runs on a computing infrastructure that uses virtual machines, forming a virtual cluster with multiple computing nodes (virtual machines) hosted on the Google Cloud Platform. Multiple computing nodes share files through the Gluster distributed file system. The multiple tasks of a workflow, activated in the context of autonomous components called Activities, are executed encapsulated in Docker containers, allowing great flexibility in the development and reuse of these Tasks in multiple application cases.

In the main directory of this repository, you have two relevant sub-directories:
- [/ExperimentationUseCases](/ExperimentationUseCases), where you'll find the workflow use-case projects done to support the validation and experimentation of the prototype;
- [/WorkflowModel](/WorkflowModel), where you'll find the source code and utility configuration files that constitute the components of the workflow model prototype. 