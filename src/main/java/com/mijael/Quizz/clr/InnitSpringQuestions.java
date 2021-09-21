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
@Order(2)
@RequiredArgsConstructor
public class InnitSpringQuestions implements CommandLineRunner {

    private final QuestionRepository questionRepository;

    @Override
    public void run(String... args) throws Exception {

        Question q52 = Question.builder()
                .category(Category.SPRING)
                .question(
                        "What is Dependency Injection?")
                .options(Arrays.asList(
                        "A design pattern which implements Inversion of Control for software applications.",
                        "One of the spring module.",
                        "A technique to get dependencies of any project.",
                        "Used to promote tight coupling in code."))
                .answer("A design pattern which implements Inversion of Control for software applications.")
                .build();

        Question q53 = Question.builder()
                .category(Category.SPRING)
                .question(
                        "Annotation for Hibernate exceptions to be translated into Spring’s DataAccessException for consistent exception handling ")
                .options(Arrays.asList(
                        "@Translation",
                        "@Repo",
                        "@Repository",
                        "None of the above"))
                .answer("@Repository")
                .build();

        Question q54 = Question.builder()
                .category(Category.SPRING)
                .question(
                        "What is the default scope of the beans? ")
                .options(Arrays.asList(
                        "Prototype",
                        "Session",
                        "Request",
                        "Singleton"))
                .answer("Singleton")
                .build();

        Question q55 = Question.builder()
                .category(Category.SPRING)
                .question(
                        "What is Bean in Spring?")
                .options(Arrays.asList(
                        "Component",
                        "Object",
                        "Class",
                        "Container"))
                .answer("Object")
                .build();


        Question q56 = Question.builder()
                .category(Category.SPRING)
                .question(
                        "What is singleton scope?")
                .options(Arrays.asList(
                        "This scopes the bean definition to a single instance per Spring IoC container.",
                        "This scopes the bean definition to a single instance per HTTP Request.",
                        "This scopes the bean definition to a single instance per HTTP Session.",
                        "This scopes the bean definition to a single instance per HTTP Application/ Global session."))
                .answer("This scopes the bean definition to a single instance per Spring IoC container.")
                .build();

        Question q57 = Question.builder()
                .category(Category.SPRING)
                .question(
                        "What is prototype scope?")
                .options(Arrays.asList(
                        "This scopes a single bean definition to have any number of object instances.",
                        "This scopes the bean definition to a single instance per HTTP Request.",
                        "This scopes the bean definition to a single instance per HTTP Session.",
                        "This scopes the bean definition to a single instance per HTTP Application/ Global session."))
                .answer("This scopes a single bean definition to have any number of object instances.")
                .build();

        Question q58 = Question.builder()
                .category(Category.SPRING)
                .question(
                        "How many types of lOC (dependency injection)? ")
                .options(Arrays.asList(
                        "Setter Injection",
                        "Constructor Injection",
                        "Interface Injection",
                        "All of the above"))
                .answer("All of the above")
                .build();

        Question q59 = Question.builder()
                .category(Category.SPRING)
                .question(
                        "To deal with the databases, spring framework provides______________ ")
                .options(Arrays.asList(
                        "DatabaseTemplate",
                        "JdbcPluggins",
                        "JdbcDrivers",
                        "JdbcTemplate"))
                .answer("JdbcTemplate")
                .build();


        Question q60 = Question.builder()
                .category(Category.SPRING)
                .question(
                        "@Component annotation on class indicates ")
                .options(Arrays.asList(
                        "that a bean should be created for the class",
                        "that a bean should not be created for the class",
                        "that autowiring should be enabled for the class",
                        "that autowiring should not be enabled for the class"))
                .answer("that a bean should be created for the class")
                .build();

        Question q61 = Question.builder()
                .category(Category.SPRING)
                .question(
                        "Spring provides features: 1 .Resource management 2 .Exception handling 3 .Transaction participation 4 .Resource unwrapping 5. Abstraction for BLOB and CLOB handling ")
                .options(Arrays.asList(
                        "1,2,3,4,5",
                        "1,3,4,5",
                        "1,2,4,5",
                        "None"))
                .answer("1,2,3,4,5")
                .build();

        Question q62 = Question.builder()
                .category(Category.SPRING)
                .question(
                        "Which ORM Spring supports ?")
                .options(Arrays.asList(
                        "Hibernate",
                        "iBatis",
                        "JPA",
                        "All of above."))
                .answer("All of above.")
                .build();

        Question q63 = Question.builder()
                .category(Category.SPRING)
                .question(
                        "Which are the IoC containers in Spring?")
                .options(Arrays.asList(
                        "BeanFactory, BeanContext, IocContextFactory",
                        "BeanFactory, ApplicationContext, BeanContext",
                        "BeanFactory, ApplicationContext",
                        "BeanFactory, ApplicationContext, IocContextFactory"))
                .answer("BeanFactory, ApplicationContext")
                .build();


        Question q64 = Question.builder()
                .category(Category.SPRING)
                .question(
                        "Which class acts as IoC Container?")
                .options(Arrays.asList(
                        "ApplicationContext",
                        "ServletContext",
                        "DispatcherServlet",
                        "None of the Above"))
                .answer("ApplicationContext")
                .build();

        Question q65 = Question.builder()
                .category(Category.SPRING)
                .question(
                        "Spring Dependency Injection is useful because it makes your code")
                .options(Arrays.asList(
                        "Easier to understand",
                        "Easier to test",
                        "Simple",
                        "All are Correct"))
                .answer("Easier to understand")
                .build();

        Question q66 = Question.builder()
                .category(Category.SPRING)
                .question(
                        "Which spring module provides the capability of DI or IOC?")
                .options(Arrays.asList(
                        "AOP",
                        "Core container",
                        "Spring web",
                        "Data access"))
                .answer("Core container")
                .build();

        Question q67 = Question.builder()
                .category(Category.SPRING)
                .question(
                        "Which tag is also allowed by static field?")
                .options(Arrays.asList(
                        "set",
                        "list",
                        "util:constant",
                        "constructor-args"))
                .answer("util:constant")
                .build();

        Question q68 = Question.builder()
                .category(Category.SPRING)
                .question(
                        "An alternative to Spring HibernateTemplate is:-")
                .options(Arrays.asList(
                        "HibernateContext",
                        "Hibernate contextual sessions",
                        "All of the mentioned",
                        "None of the mentioned"))
                .answer("Hibernate contextual sessions")
                .build();

        Question q69 = Question.builder()
                .category(Category.SPRING)
                .question(
                        "DAO methods require access to the session factory, which can be injected:-")
                .options(Arrays.asList(
                        "a setter method",
                        "constructor argument",
                        "none of the mentioned",
                        "all of the mentioned"))
                .answer("all of the mentioned")
                .build();

        Question q70 = Question.builder()
                .category(Category.SPRING)
                .question(
                        "Spring provides to simplify your DAO implementation by managing entitymanagers and transactions for you:-")
                .options(Arrays.asList(
                        "HibernateTemplate",
                        "JpaTemplate",
                        "SpringTemplate",
                        "None of the mentioned"))
                .answer("JpaTemplate")
                .build();

        Question q71 = Question.builder()
                .category(Category.SPRING)
                .question(
                        "Design pattern implemented by Dispatcher Servlet.")
                .options(Arrays.asList(
                        "jsp",
                        "tiles",
                        "front controller",
                        "none of the mentioned"))
                .answer("front controller")
                .build();

        Question q72 = Question.builder()
                .category(Category.SPRING)
                .question(
                        "Annotation for Controller Class.")
                .options(Arrays.asList(
                        "@Before",
                        "@Controller",
                        "@After",
                        "@Exception"))
                .answer("@Controller")
                .build();

        Question q73 = Question.builder()
                .category(Category.SPRING)
                .question(
                        "Handler method annotation.")
                .options(Arrays.asList(
                        "@Before",
                        "@Controller",
                        "@After",
                        "@RequestMapping"))
                .answer("@RequestMapping")
                .build();

        Question q74 = Question.builder()
                .category(Category.SPRING)
                .question(
                        "Method arguments that can be used in handler methods using the @RequestMapping annotation.")
                .options(Arrays.asList(
                        "HttpServletRequest or HttpServleResponse",
                        "@RequestParam",
                        "@ModelAttribute",
                        "All of the mentioned"))
                .answer("All of the mentioned")
                .build();

        Question q75 = Question.builder()
                .category(Category.SPRING)
                .question(
                        "To publish a REST service with Spring.")
                .options(Arrays.asList(
                        "publishing an application’s data as a REST service",
                        "accessing data from third-party REST services",
                        "none of the mentioned",
                        "all of the mentioned"))
                .answer("all of the mentioned")
                .build();

        Question q76 = Question.builder()
                .category(Category.SPRING)
                .question(
                        "Publishing an application’s data as a REST service requires.")
                .options(Arrays.asList(
                        "@RequestMapping",
                        "@PathVariable",
                        "All of the mentioned",
                        "None of the mentioned"))
                .answer("All of the mentioned")
                .build();

        Question q77 = Question.builder()
                .category(Category.SPRING)
                .question(
                        "Annotation added as an input parameter to the handler method.")
                .options(Arrays.asList(
                        "@PathVariable",
                        "@Path",
                        "@PathLocale",
                        "None of the mentioned"))
                .answer("@PathVariable")
                .build();

        Question q78 = Question.builder()
                .category(Category.SPRING)
                .question(
                        "REST service end point comprises an address.")
                .options(Arrays.asList(
                        "starts with http:// and ends with ?",
                        "starts with http:// and ends with &",
                        "no certain URL is specified",
                        "depends upon the platform used"))
                .answer("starts with http:// and ends with ?")
                .build();

        Question q79 = Question.builder()
                .category(Category.SPRING)
                .question(
                        "Payload format for REST services.")
                .options(Arrays.asList(
                        "RSS",
                        "Atom",
                        "JSON",
                        "All of the mentioned"))
                .answer("All of the mentioned")
                .build();

        Question q80 = Question.builder()
                .category(Category.SPRING)
                .question(
                        "JSON payload consists of text and separators like.")
                .options(Arrays.asList(
                        "{ , }",
                        "( , )",
                        ":",
                        "All of the mentioned"))
                .answer("All of the mentioned")
                .build();

        Question q81 = Question.builder()
                .category(Category.SPRING)
                .question(
                        "Class which is capable of performing a multitude of operations on REST services.")
                .options(Arrays.asList(
                        "RestTemplate",
                        "XPathTemplate",
                        "XMLTemplate",
                        "JavaTemplate"))
                .answer("RestTemplate")
                .build();

        Question q82 = Question.builder()
                .category(Category.SPRING)
                .question(
                        "Beans can be created by which of the following properties?")
                .options(Arrays.asList(
                        "Scope",
                        "Property",
                        "Class",
                        "It’s own constructor"))
                .answer("It’s own constructor")
                .build();

        Question q83 = Question.builder()
                .category(Category.SPRING)
                .question(
                        "Which scope creates a new bean instance each time when requested?")
                .options(Arrays.asList(
                        "Singleton",
                        "Prototype",
                        "Session",
                        "Request"))
                .answer("Prototype")
                .build();

        Question q84 = Question.builder()
                .category(Category.SPRING)
                .question(
                        "Which attribute is used to set the scope of the bean?")
                .options(Arrays.asList(
                        "setScope",
                        "scope",
                        "getScope",
                        "none of the mentioned"))
                .answer("scope")
                .build();

        Question q85 = Question.builder()
                .category(Category.SPRING)
                .question(
                        "Which of the following are considered valid beans?")
                .options(Arrays.asList(
                        "Singleton",
                        "Prototype",
                        "All of the mentioned",
                        "None of the mentioned"))
                .answer("All of the mentioned")
                .build();

        Question q86 = Question.builder()
                .category(Category.SPRING)
                .question(
                        "Which annotation is used as a substitute of initialization method?")
                .options(Arrays.asList(
                        "@PostConstruct",
                        "@PreDestroy",
                        "None of the mentioned",
                        "All of the mentioned"))
                .answer("@PostConstruct")
                .build();

        Question q87 = Question.builder()
                .category(Category.SPRING)
                .question(
                        "Which annotation is used as a substitute of destroy method?")
                .options(Arrays.asList(
                        "@PostConstruct",
                        "@PreDestroy",
                        "None of the mentioned",
                        "All of the mentioned"))
                .answer("@PreDestroy")
                .build();

        questionRepository.saveAll(Arrays.asList(q52, q53, q54, q55, q56, q57, q58, q59, q60, q61, q62, q63, q64, q65,
                q66, q67, q68, q69, q70, q71, q72, q73, q74, q75, q76,
                q77, q78, q79, q80, q81, q82, q83, q84, q85, q86, q87));

    }
}
