package com.example.raymond.myapplication;

public class testbank {
    private String questions[] = {
            "1. Which of the following are all of the seven types of control nodes used in an activity diagram? ",
            "2. Which are of the following statements are true about an object flow? ",
            "3. Which of the following is a major element of an overview use case? ",
            "4. What does CRUD stand for? ",
            "5. Which of the following are not key aspects in creating use cases? ",
            "6. Which of the following are not control nodes used in an activity diagram? ",
            "7. What is the Scrum Team consisted of? ",
            "8. Which of the following is not a core value of the Agile Manifesto ",
            "9. Which of the following is a service performed by the Scrum Master to the Product Owner ",
            "10. Which of the following is a service performed by the Scrum Master to the Product Owner ",
            "11. Which of the following is not a process in Design Thinking? ",
            "12. Why should you prototype in Design Thinking? ",
            "13. Which of the following are not methods in the Test mode? "
    };

    private String choices [][] = {
            {"Initial, final-activity, final-flow, decision, split, knife and stop ", "Final-activity, final-flow, merge, split, chopsticks and join ", "Initial, final-activity, final-flow, decision, merge, fork and join", "Final-activity, final-flow, decision, merge, spoon, join, stop"},
            {"This flow can only be attached to actions or activities ", "It is represented by a solid line with an arrowhead on it showing the direction of the flow ", "It shows the sequence of execution through a business process ", "They are depicted as a dashed line with an arrow on it showing the direction of the flow"},
            {"Primary actor", "Trigger and trigger type", "Normal flow of events", "Stakeholders and interests"},
            {"Create, randomise, update, detach", "Cut, read, update, desert", "Create, read, update, delete", "Cut, reuse, upstage, dismiss "},
            {"Keep all steps as simple as possible","Make clear the initiator and receiver of action in each step","Ensure that each use case represents a sensible set of actions","All of the above are key aspects in creating use cases"},
            {"Fork","Merge","Initial","Chopsticks"},
            {"Product Analysts, the Creative Team and a Scrum Bear","Product Owner, the Innovation Team and a Scrum King","Product Lovers, the Jump Team and a Scrum","Product Owner, the Development Team and a Scrum Master"},
            {"Individuals and interactions","Fast and accurate responses","Responding to change","Customer collaboration"},
            {"Updating the daily diary","Coaching the Development Team","Finding techniques for effective Product Backlog management","Facilitating Scrum events as requested or needed"},
            {"5 minutes","15 minutes","20 minutes","3 hours"},
            {"Emphasise","Design","Ideate","Make"},
            {"To start a conversation","To refine solutions","To find appropriate themes","To refine your POV"},
            {"Testing users on their empathy","Create experiences","Ask users to compare","Show don’t tell"}


    };

    private String hint [] = {
            "The initial node portrays the beginning of a set of actions or activities",
            "An object flow shows the flow of an object from one activity (or action) to another activity (or action) ",
            "Other major elements of an overview use case are name, ID number, type and a brief description",
            "CRUD is the basic elemental actions that are needed regarding almost all tasks",
            "A use case is a description of what the system does from the perspective of a user.",
            "Control nodes are usually made to denote actions",
            "The Product Owner is the sole person responsible for managing the Product Backlog",
            "The values are centred on people and collaboration",
            "The Scrum Master is responsible for ensuring Scrum is understood and enacted",
            "The Daily Scrum is used for the Development Team to create a plan for the next 24 hours ",
            "Other processes include Prototype and Test",
            "The Prototype mode is used to answer questions that get you closer to your final solution",
            "The Test Mode is another opportunity to gain empathy for the people you are designing for"
    };

    private String answers [] = {"Initial, final-activity, final-flow, decision, merge, fork and join", "They are depicted as a dashed line with an arrow on it showing the direction of the flow", "Primary actor", "Create, read, update, delete", "All of the above are key aspects in creating use cases","Chopsticks","Product Owner, the Development Team and a Scrum Master","Fast and accurate responses","Finding techniques for effective Product Backlog management","15 minutes", "Make","To start a conversation","Testing users on their empathy"};

    public String getQuestion(int a){
        return questions[a];
    }

    public String getHint(int a){
        return hint[a];
    }

    public String getChoice1(int a){
        return choices[a][0];
    }
    public String getChoice2(int a){
        return choices[a][1];
    }
    public String getChoice3(int a){
        return choices[a][2];
    }
    public String getChoice4(int a){
        return choices[a][3];
    }
    public String getAnswer(int a){
        return answers[a];
    }

}

