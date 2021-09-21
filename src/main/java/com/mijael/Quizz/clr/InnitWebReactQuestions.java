package com.mijael.Quizz.clr;

import com.mijael.Quizz.beans.Category;
import com.mijael.Quizz.beans.Question;
import com.mijael.Quizz.repos.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Order(3)
@RequiredArgsConstructor
public class InnitWebReactQuestions implements CommandLineRunner {

    private final QuestionRepository questionRepository;

    @Override
    public void run(String... args) throws Exception {

        Question q88 = Question.builder()
                .category(Category.WEB)
                .question(
                        "Which are the different Data Types supported by Typescript?")
                .options(Arrays.asList(
                        "Boolean var bValue: boolean = false",
                        "String var name: string = \"jon\"",
                        "All of the above mentioned",
                        "Number var age: number = 16"))
                .answer("All of the above mentioned")
                .build();


        Question q89 = Question.builder()
                .category(Category.WEB)
                .question(
                        "Which statements are true regarding JSX modes?")
                .options(Arrays.asList(
                        "These modes only affect the emit stage - type checking is unaffected",
                        "The react mode will emit React.addElement",
                        "The output of react mode will have a .jsx file extension",
                        "The preserve mode will keep the JSX as part of the output to be further consumed by another transform step"))
                .answer("The preserve mode will keep the JSX as part of the output to be further consumed by another transform step")
                .build();

        Question q90 = Question.builder()
                .category(Category.WEB)
                .question(
                        "What are variables in Typescript?")
                .options(Arrays.asList(
                        "A variable name should contain alphabets and numeric digits",
                        " It cannot contain spaces and special characters except underscore (_) and dollar ($) sign",
                        "A variable name cannot begin with a digit",
                        "All"))
                .answer("All")
                .build();

        Question q91 = Question.builder()
                .category(Category.WEB)
                .question(
                        "What are the variable scopes available in TypeScript?")
                .options(Arrays.asList(
                        "Global Scope",
                        "Class Scope",
                        "Local Scope",
                        "All of the above"))
                .answer("All of the above")
                .build();

        Question q92 = Question.builder()
                .category(Category.WEB)
                .question(
                        "What are the benefits of Typescript?")
                .options(Arrays.asList(
                        "It helps in code structuring",
                        "Use class based object oriented programming",
                        "Impose coding guidelines",
                        "All of the above"))
                .answer("All of the above")
                .build();

        Question q93 = Question.builder()
                .category(Category.WEB)
                .question(
                        "Which object oriented terms are supported by Typescript?")
                .options(Arrays.asList(
                        "Modules",
                        "Classes",
                        "Interfaces",
                        "All of these"))
                .answer("All of these")
                .build();

        Question q94 = Question.builder()
                .category(Category.WEB)
                .question(
                        "List some features of Typescript?")
                .options(Arrays.asList(
                        "Typescript can be compiled to all major versions of Javascript(ES3,ES5,ES6,ES7)",
                        "Typescript can be used for cross –browser development and is an open source project",
                        "Typescript is a superset of JavaScript that provides typed nature to your code",
                        "All of the above"))
                .answer("All of the above")
                .build();

        Question q95 = Question.builder()
                .category(Category.WEB)
                .question(
                        "What are the components of TypeScript?")
                .options(Arrays.asList(
                        "TypeScript Language",
                        "TypeScript Compiler",
                        "TypeScript Language Service",
                        "All of these"))
                .answer("All of these")
                .build();

        Question q96 = Question.builder()
                .category(Category.WEB)
                .question(
                        "What are the types of access modifiers supported by TypeScript?")
                .options(Arrays.asList(
                        "Public",
                        "Private",
                        "Protected",
                        "All of these"))
                .answer("All of these")
                .build();

        Question q97 = Question.builder()
                .category(Category.REACT)
                .question(
                        "Which of the following are the advantages of React.js?")
                .options(Arrays.asList(
                        "React.js can increase the application's performance with Virtual DOM.",
                        "React.js is easy to integrate with other frameworks such as Angular, BackboneJS since it is only a view library.",
                        "React.js can render both on client and server side.",
                        "All of the above"))
                .answer("All of the above")
                .build();

        Question q98 = Question.builder()
                .category(Category.REACT)
                .question(
                        "Which of the following is not a disadvantage of React.js?")
                .options(Arrays.asList(
                        "React.js has only a view layer. We have put your code for Ajax requests, events and so on.",
                        "The library of React.js is pretty large.",
                        "The JSX in React.js makes code easy to read and write.",
                        "The learning curve can be steep in React.js."))
                .answer("The JSX in React.js makes code easy to read and write.")
                .build();

        Question q99 = Question.builder()
                .category(Category.REACT)
                .question(
                        " Which of the following command is used to install create-react-app?")
                .options(Arrays.asList(
                        "npm install -g create-react-app",
                        "npm install create-react-app",
                        "npm install -f create-react-app",
                        "install -g create-react-app"))
                .answer("npm install -g create-react-app")
                .build();

        Question q100 = Question.builder()
                .category(Category.REACT)
                .question(
                        "What of the following is used in React.js to increase performance?")
                .options(Arrays.asList(
                        "Original DOM",
                        "Virtual DOM",
                        "Both A and B.",
                        "None of the above."))
                .answer("Virtual DOM")
                .build();

        Question q101 = Question.builder()
                .category(Category.REACT)
                .question(
                        "A class is a type of function, but instead of using the keyword function to initiate it, which keyword do we use?")
                .options(Arrays.asList(
                        "Constructor",
                        "Class",
                        "Object",
                        "DataObject"))
                .answer("Class")
                .build();

        Question q102 = Question.builder()
                .category(Category.REACT)
                .question(
                        "Which of the following acts as the input of a class-based component?")
                .options(Arrays.asList(
                        "Class",
                        "Factory",
                        "Render",
                        "Props"))
                .answer("Props")
                .build();

        Question q103 = Question.builder()
                .category(Category.REACT)
                .question(
                        "Which of the following keyword is used to create a class inheritance?")
                .options(Arrays.asList(
                        "Create",
                        "Inherits",
                        "Extends",
                        "This"))
                .answer("Extends")
                .build();

        Question q104 = Question.builder()
                .category(Category.REACT)
                .question(
                        "What is the declarative way to render a dynamic list of components based on values in an array?")
                .options(Arrays.asList(
                        "Using the reduce array method",
                        "Using the <Each /> component",
                        "Using the Array.map() method",
                        "With a for/while loop"))
                .answer("Using the Array.map() method")
                .build();

        Question q105 = Question.builder()
                .category(Category.REACT)
                .question(
                        "What is a state in React?")
                .options(Arrays.asList(
                        "A permanent storage.",
                        "Internal storage of the component.",
                        "External storage of the component.",
                        "None of the above."))
                .answer("Internal storage of the component.")
                .build();

        Question q106 = Question.builder()
                .category(Category.REACT)
                .question(
                        "What are the two ways to handle data in React?")
                .options(Arrays.asList(
                        "State & Props",
                        "Services & Components",
                        "State & Services",
                        "State & Component"))
                .answer("State & Props")
                .build();

        Question q107 = Question.builder()
                .category(Category.REACT)
                .question(
                        "Which of the following is a must API for every React.js component?")
                .options(Arrays.asList(
                        "SetinitialComponent",
                        "renderComponent",
                        "render",
                        "All of the above"))
                .answer("renderComponent")
                .build();

        Question q108 = Question.builder()
                .category(Category.REACT)
                .question(
                        "Which of the following is used to pass data to a component from outside in React.js?")
                .options(Arrays.asList(
                        "SetState",
                        "Render with arguments",
                        "Props",
                        "PropTypes"))
                .answer("Props")
                .build();

        Question q109 = Question.builder()
                .category(Category.REACT)
                .question(
                        "Which of the following function is used to change the state of the React.js component?")
                .options(Arrays.asList(
                        "this.setState",
                        "this.setChangeState",
                        "this.State{}",
                        "None of the above"))
                .answer("this.setState")
                .build();

        Question q110 = Question.builder()
                .category(Category.REACT)
                .question(
                        "Which of the following method refers to the parent class in React.js?")
                .options(Arrays.asList(
                        "inherits()",
                        "self()",
                        "super()",
                        "this()"))
                .answer("super()")
                .build();

        Question q111 = Question.builder()
                .category(Category.REACT)
                .question(
                        "What will happen if you render an input element with disabled = {false}?")
                .options(Arrays.asList(
                        "It will be rendered as disabled",
                        "It will not be rendered at all",
                        "It will be rendered as enabled",
                        "You cannot set it false."))
                .answer("It will be rendered as enabled")
                .build();

        Question q112 = Question.builder()
                .category(Category.REACT)
                .question(
                        "Which of the following function is called to render HTML to the web page in React?")
                .options(Arrays.asList(
                        "render()",
                        "ReactDOM_render()",
                        "DomRender()",
                        "React_render"))
                .answer("render()")
                .build();

        Question q113 = Question.builder()
                .category(Category.REACT)
                .question(
                        "Which of the following lifecycle events React components have at the highest level?")
                .options(Arrays.asList(
                        "Destruction",
                        "Initialization",
                        "State/Property Updates",
                        "All of the above."))
                .answer("All of the above.")
                .build();

        Question q114 = Question.builder()
                .category(Category.REACT)
                .question(
                        "Why is the usage of setState?")
                .options(Arrays.asList(
                        "Invoke code after the setState operation is done.",
                        "Replace the state completely instead of the default merge action.",
                        "Access the previous state before the setState operation.",
                        "None of the above."))
                .answer("Invoke code after the setState operation is done.")
                .build();

        Question q115 = Question.builder()
                .category(Category.REACT)
                .question(
                        "Which of the following best defines the \"key\" prop?")
                .options(Arrays.asList(
                        "\"Key\" prop is used to look pretty, and there is no benefit whatsoever.",
                        "\"Key\" prop is a way for React to identify a newly added item in a list and compare it during the \"diffing\" algorithm.",
                        "It is one of the attributes in HTML.",
                        "It is NOT commonly used in an array."))
                .answer("\"Key\" prop is a way for React to identify a newly added item in a list and compare it during the \"diffing\" algorithm.")
                .build();

        Question q116 = Question.builder()
                .category(Category.REACT)
                .question(
                        "Which of the following method is not a part of ReactDOM?")
                .options(Arrays.asList(
                        "ReactDOM.destroy()",
                        "ReactDOM.hydrate()",
                        "ReactDOM.createPortal()",
                        "ReactDOM.findDOMNode()"))
                .answer("ReactDOM.destroy()")
                .build();

        Question q117 = Question.builder()
                .category(Category.REACT)
                .question(
                        "How can you set a default value for an uncontrolled form field?")
                .options(Arrays.asList(
                        "By using the value property",
                        "By using the defaultValue property",
                        "By using the default property",
                        "It is assigned automatically."))
                .answer("By using the defaultValue property")
                .build();

        Question q118 = Question.builder()
                .category(Category.REACT)
                .question(
                        "We can update the state in React.js by calling to setState() method. These calls are:")
                .options(Arrays.asList(
                        "Synchronous in nature.",
                        "Asynchronous in nature.",
                        "Are asynchronous but can be made synchronous when required.",
                        "None of the above."))
                .answer("Asynchronous in nature.")
                .build();

        Question q119 = Question.builder()
                .category(Category.REACT)
                .question(
                        " Which of the following statement is true for uncontrolled components in React.js?")
                .options(Arrays.asList(
                        "The source of truth is DOM.",
                        "The source of truth is a component state.",
                        "The source of truth can be anything.",
                        "None of the above."))
                .answer("The source of truth is DOM.")
                .build();

        Question q120 = Question.builder()
                .category(Category.REACT)
                .question(
                        "What is the use of the create-react-app command in the React.js application?")
                .options(Arrays.asList(
                        "It is used to update a React app.",
                        "It is used to create a new React app.",
                        "It is used to install dependencies.",
                        "None of the above."))
                .answer("It is used to create a new React app.")
                .build();

        questionRepository.saveAll(Arrays.asList(q88, q89, q90, q91, q92, q93, q94, q95, q96, q97, q98, q99, q100, q101, q102, q103, q104, q105, q106
                , q107, q108, q109, q110, q111, q112, q113, q114, q115, q116, q117, q118, q119, q120));

    }
}