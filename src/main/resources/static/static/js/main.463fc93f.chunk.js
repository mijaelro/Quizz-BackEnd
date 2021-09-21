(this.webpackJsonpquizz=this.webpackJsonpquizz||[]).push([[0],{100:function(e,t,n){"use strict";n.r(t);var s=n(2),c=n.n(s),i=n(47),r=n.n(i),a=(n(60),function(e){e&&e instanceof Function&&n.e(3).then(n.bind(null,101)).then((function(t){var n=t.getCLS,s=t.getFID,c=t.getFCP,i=t.getLCP,r=t.getTTFB;n(e),s(e),c(e),i(e),r(e)}))}),o=n(48),l=n(15),j=(n(61),n(0));var d=function(){return Object(j.jsx)("header",{children:Object(j.jsx)("nav",{id:"nav-wrap",children:Object(j.jsxs)("ul",{id:"nav",className:"nav",children:[Object(j.jsx)("li",{className:"current",children:Object(j.jsx)(l.b,{activeClassName:"active",to:"/home",className:"smoothscroll",children:"Home"})}),Object(j.jsx)("li",{className:"current",children:Object(j.jsx)(l.b,{activeClassName:"active",to:"/level",className:"smoothscroll",children:"Play"})}),Object(j.jsx)("li",{className:"current",children:Object(j.jsx)(l.b,{activeClassName:"active",to:"/questions",className:"smoothscroll",children:"Questions"})}),Object(j.jsx)("li",{className:"current",children:Object(j.jsx)(l.b,{activeClassName:"active",to:"/about",className:"smoothscroll",children:"About"})})]})})})},u=n(5);n(68);var b=function(){var e=Object(u.g)();return Object(j.jsxs)("div",{className:"About",children:[Object(j.jsx)("h1",{id:"niceTitle",children:"About"}),Object(j.jsxs)("p",{children:["This page contains more than 100 questions overall  with the following categories: ",Object(j.jsx)("br",{})," ",Object(j.jsxs)("span",{id:"categ",children:[" Java , Spring , React , Web ",Object(j.jsx)("span",{})]}),Object(j.jsx)("br",{}),Object(j.jsx)("br",{}),"just chose a level and start playing , levels are: ",Object(j.jsx)("br",{})," ",Object(j.jsx)("span",{id:"categ",children:" Easy=25 questions ,Medium = 60 questions , Hard = 100 questions"})," ",Object(j.jsx)("br",{}),Object(j.jsx)("br",{}),Object(j.jsx)("span",{id:"note",children:"note:"}),Object(j.jsx)("span",{children:"doesn't matter which level you choose the questions get shuffled , meaning that you will get different questions in each test."})]}),Object(j.jsx)("h4",{children:"If you have any ideas i invite you to send them to me in the following link"}),Object(j.jsx)("button",{className:"myButton4",onClick:function(){return e.push("/sendIdeas")},children:" Send Ideas"}),Object(j.jsxs)("h5",{children:["this page was made by ",Object(j.jsx)("a",{href:"https://www.linkedin.com/in/mijael-rofe-42a264180/",target:"_blank",rel:"noreferrer",children:"Mijael Rofe"})]})]})};n(69);var h=function(){var e=Object(u.g)();return Object(j.jsxs)("div",{className:"Level",children:[Object(j.jsx)("h1",{id:"niceTitle",children:"Choose your level"}),Object(j.jsxs)("div",{className:"flex-container",children:[Object(j.jsxs)("div",{className:"flex-item",children:[" ",Object(j.jsx)("button",{className:"myButton",onClick:function(){return e.push("/easy")},children:"Easy"})]}),Object(j.jsx)("div",{className:"flex-item",children:Object(j.jsx)("button",{className:"myButton2",onClick:function(){return e.push("/medium")},children:"Medium"})}),Object(j.jsxs)("div",{className:"flex-item",children:["  ",Object(j.jsx)("button",{className:"myButton3",onClick:function(){return e.push("/hard")},children:"Hard"})," "]})]})]})};n(70);var O,x=function(){var e=Object(u.g)();return Object(j.jsxs)("div",{className:"Home",children:[Object(j.jsx)("h1",{className:"responsive-headline",children:"Mi-Quizz"}),Object(j.jsxs)("div",{className:"infoo",children:[Object(j.jsx)("h3",{children:"This is a quizz app for junior Java fullstack developers to get ready for Jo interview questions.  "}),Object(j.jsx)("span",{id:"click",children:"Click bellow to start playing!"})]}),Object(j.jsx)("div",{className:"infooPlay",children:Object(j.jsx)("button",{className:"myButton",onClick:function(){return e.push("/level")},children:"Start"})})]})},m=n(7),p=n(3),v=n.n(p),f=n(9),g=n(4),w=n(20),q=n.n(w),y=n(18),N=n(10),k=function e(){Object(N.a)(this,e),this.questions=[]};function S(e){return{type:O.QuestionsDownloaded,payload:e}}!function(e){e.QuestionsDownloaded="QuestionsDownloaded",e.QuestionAdded="QuestionAdded",e.QuestionUpdated="QuestionUpdated",e.QuestionDeleted="QuestionDeleted"}(O||(O={}));var C,L,Q=n(34),_=Object(Q.a)({questionsState:function(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:new k,t=arguments.length>1?arguments[1]:void 0,n=Object(y.a)({},e);switch(t.type){case O.QuestionsDownloaded:n.questions=t.payload;break;case O.QuestionAdded:n.questions.push(t.payload);break;case O.QuestionUpdated:var s=n.questions.findIndex((function(e){return e.id===t.payload.id}));n.questions[s]=t.payload;break;case O.QuestionDeleted:n.questions=n.questions.filter((function(e){return e.id!==t.payload}))}return n}}),A=Object(Q.b)(_),F=n(35),T=n(33),z=function e(){Object(N.a)(this,e)},B=function(e){Object(F.a)(n,e);var t=Object(T.a)(n);function n(){var e;Object(N.a)(this,n);for(var s=arguments.length,c=new Array(s),i=0;i<s;i++)c[i]=arguments[i];return(e=t.call.apply(t,[this].concat(c))).urls={questions:"/questions/"},e}return n}(z),I=new B,E=(n(90),function(e){return Object(j.jsxs)("div",{className:"EmptyView",children:[Object(j.jsx)("h2",{id:"niceTitle2",children:e.msg}),Object(j.jsx)("img",{alt:"empty view",src:"https://media2.giphy.com/media/swhRkVYLJDrCE/giphy.gif?cid=ecf05e47zh9njc4uohd1gua33op3p61n33ba5l309hwbdioo&rid=giphy.gif&ct=g"})]})}),J=function(e){return Object(m.a)(e).sort((function(){return Math.random()-.5}))},M=n(29),D=n(30),U=D.a.div(C||(C=Object(M.a)(["\n  max-width: 1100px;\n  background: #7d40b5bf;\n  border-radius: 10px;\n  border: 2px solid #5cbf2a;\n  padding: 20px;\n  box-shadow: 0px 5px 10px rgba(0, 0, 0, 0.25);\n  text-align: center;\n  p {\n    font-size: 1rem;\n  }\n"]))),H=D.a.div(L||(L=Object(M.a)(["\n  transition: all 0.3s ease;\n  :hover {\n    opacity: 0.4;\n  }\n  button {\n    cursor: pointer;\n    user-select: none;\n    font-size: 0.8rem;\n    width: 100%;\n    height: 40px;\n    margin: 5px 0;\n    background: ",";\n    border: 3px solid  #45084d;\n    box-shadow: 1px 2px 0px rgba(0, 0, 0, 0.1);\n    border-radius: 10px;\n    color: black;\n    text-shadow: 0px 1px 0px rgba(0, 0, 0, 0.25);\n  }\n"])),(function(e){var t=e.correct,n=e.userClicked;return t?"linear-gradient(90deg, #56FFA4, #59BC86)":!t&&n?"linear-gradient(90deg, #FF5656, #C16868)":"#d48cffc7"})),R=function(e){var t;return Object(j.jsxs)(U,{children:[Object(j.jsxs)("p",{className:"number",children:["Question: ",e.questionNr,"/",e.totalQuestions]}),Object(j.jsx)("p",{className:"question",children:e.question}),Object(j.jsx)("div",{children:null===(t=e.answers)||void 0===t?void 0:t.map((function(t){var n,s;return Object(j.jsx)(H,{correct:(null===(n=e.userAnswer)||void 0===n?void 0:n.correctAnswer)===t,userClicked:(null===(s=e.userAnswer)||void 0===s?void 0:s.answer)===t,children:Object(j.jsx)("button",{disabled:!!e.userAnswer,value:t,onClick:e.callback,children:Object(j.jsx)("span",{dangerouslySetInnerHTML:{__html:t}})})},t)}))})]})};n(94);var K=function(){var e,t,n=Object(s.useState)(A.getState().questionsState.questions),c=Object(g.a)(n,2),i=c[0],r=c[1],a=Object(s.useState)(!1),o=Object(g.a)(a,2),l=o[0],d=o[1],u=Object(s.useState)(0),b=Object(g.a)(u,2),h=b[0],O=b[1],x=Object(s.useState)([]),p=Object(g.a)(x,2),w=p[0],y=p[1],N=Object(s.useState)(0),k=Object(g.a)(N,2),C=k[0],L=k[1],Q=Object(s.useState)(!0),_=Object(g.a)(Q,2),F=_[0],T=_[1],z=Object(s.useState)(0),B=Object(g.a)(z,2),M=B[0],D=B[1],U=function(){var e=Object(f.a)(v.a.mark((function e(){var t;return v.a.wrap((function(e){for(;;)switch(e.prev=e.next){case 0:return d(!0),T(!1),e.next=4,q.a.get(I.urls.questions+"q/e");case 4:t=e.sent,A.dispatch(S(t.data)),r(J(t.data)),L(0),D(0),y([]),O(0),d(!1);case 12:case"end":return e.stop()}}),e)})));return function(){return e.apply(this,arguments)}}(),H=function(){var e=h+1;25===e?(T(!0),D(C)):O(e)};return Object(j.jsx)("div",{className:"Easy",children:Object(j.jsxs)("div",{className:"Wrapper",children:[F&&0===M?Object(j.jsxs)(j.Fragment,{children:[Object(j.jsx)("h1",{children:"FULLSTACK QUIZ"}),Object(j.jsx)("span",{id:"span1",children:"(Easy-25)"}),Object(j.jsx)("span",{id:"span11",children:"click play to get started!"}),Object(j.jsx)("button",{className:"myButton start",onClick:U,children:"\u25b6"})]}):null,F&&0!==M&&Object(j.jsxs)(j.Fragment,{children:[Object(j.jsx)("div",{className:"bluring",children:Object(j.jsxs)("span",{id:"finalScore",children:["Your final is score is ",Object(j.jsx)("br",{}),Object(j.jsxs)("span",{id:"reddish",children:[C,"/25"]}),"  ",Object(j.jsx)("br",{})," Try again!"]})}),Object(j.jsx)("button",{className:"myButton start",onClick:U,children:"retry"})]}),l&&Object(j.jsx)("div",{children:Object(j.jsx)(E,{msg:"Loading questions.."})}),F?null:Object(j.jsxs)("p",{className:"score",children:["Score: ",C]}),!l&&!F&&Object(j.jsx)(R,{question:null===(e=i[h])||void 0===e?void 0:e.question,userAnswer:w?w[h]:void 0,questionNr:h+1,totalQuestions:25,answers:J(null===(t=i[h])||void 0===t?void 0:t.options),callback:function(e){if(!F){var t,n,s,c=e.currentTarget.value,r=(null===(t=i[h])||void 0===t?void 0:t.answer)===c;r&&L((function(e){return e+1}));var a={question:null===(n=i[h])||void 0===n?void 0:n.question,answer:c,correct:r,correctAnswer:null===(s=i[h])||void 0===s?void 0:s.answer};y((function(e){return[].concat(Object(m.a)(e),[a])}))}}}),F||l||w.length!==h+1||h+1===25?F||l||h+1!=25?null:Object(j.jsx)("button",{className:"next",onClick:H,children:"Finish"}):Object(j.jsx)("button",{className:"next",onClick:H,children:"Next Question"})]})})},Y=(n(95),100);var P=function(){var e,t,n=Object(s.useState)(A.getState().questionsState.questions),c=Object(g.a)(n,2),i=c[0],r=c[1],a=Object(s.useState)(!1),o=Object(g.a)(a,2),l=o[0],d=o[1],u=Object(s.useState)(0),b=Object(g.a)(u,2),h=b[0],O=b[1],x=Object(s.useState)([]),p=Object(g.a)(x,2),w=p[0],y=p[1],N=Object(s.useState)(0),k=Object(g.a)(N,2),C=k[0],L=k[1],Q=Object(s.useState)(!0),_=Object(g.a)(Q,2),F=_[0],T=_[1],z=Object(s.useState)(0),B=Object(g.a)(z,2),M=B[0],D=B[1],U=function(){var e=Object(f.a)(v.a.mark((function e(){var t;return v.a.wrap((function(e){for(;;)switch(e.prev=e.next){case 0:return d(!0),T(!1),e.next=4,q.a.get(I.urls.questions+"q/h");case 4:t=e.sent,A.dispatch(S(t.data)),r(J(t.data)),L(0),D(0),y([]),O(0),d(!1);case 12:case"end":return e.stop()}}),e)})));return function(){return e.apply(this,arguments)}}(),H=function(){var e=h+1;e===Y?(T(!0),D(C)):O(e)};return Object(j.jsx)("div",{className:"Easy",children:Object(j.jsxs)("div",{className:"Wrapper",children:[F&&0===M?Object(j.jsxs)(j.Fragment,{children:[Object(j.jsx)("h1",{children:"FULLSTACK QUIZ"}),Object(j.jsx)("span",{id:"span3",children:"(Hard-100)"}),Object(j.jsx)("span",{id:"span11",children:"click play to get started!"}),Object(j.jsx)("button",{className:"myButton start",onClick:U,children:"\u25b6"})]}):null,F&&0!==M&&Object(j.jsxs)(j.Fragment,{children:[Object(j.jsx)("div",{className:"bluring",children:Object(j.jsxs)("span",{id:"finalScore",children:["Your final is score is ",Object(j.jsx)("br",{}),Object(j.jsxs)("span",{id:"reddish",children:[C,"/25"]}),"  ",Object(j.jsx)("br",{})," Try again!"]})}),Object(j.jsx)("button",{className:"myButton start",onClick:U,children:"retry"})]}),l&&Object(j.jsx)("div",{children:Object(j.jsx)(E,{msg:"Loading questions.."})}),F?null:Object(j.jsxs)("p",{className:"score",children:["Score: ",C]}),!l&&!F&&Object(j.jsx)(R,{question:null===(e=i[h])||void 0===e?void 0:e.question,userAnswer:w?w[h]:void 0,questionNr:h+1,totalQuestions:Y,answers:J(null===(t=i[h])||void 0===t?void 0:t.options),callback:function(e){if(!F){var t,n,s,c=e.currentTarget.value,r=(null===(t=i[h])||void 0===t?void 0:t.answer)===c;r&&L((function(e){return e+1}));var a={question:null===(n=i[h])||void 0===n?void 0:n.question,answer:c,correct:r,correctAnswer:null===(s=i[h])||void 0===s?void 0:s.answer};y((function(e){return[].concat(Object(m.a)(e),[a])}))}}}),F||l||w.length!==h+1||h+1===Y?F||l||h+1!=Y?null:Object(j.jsx)("button",{className:"next",onClick:H,children:"Finish"}):Object(j.jsx)("button",{className:"next",onClick:H,children:"Next Question"})]})})};n(96);var W=function(){var e,t,n=Object(s.useState)(A.getState().questionsState.questions),c=Object(g.a)(n,2),i=c[0],r=c[1],a=Object(s.useState)(!1),o=Object(g.a)(a,2),l=o[0],d=o[1],u=Object(s.useState)(0),b=Object(g.a)(u,2),h=b[0],O=b[1],x=Object(s.useState)([]),p=Object(g.a)(x,2),w=p[0],y=p[1],N=Object(s.useState)(0),k=Object(g.a)(N,2),C=k[0],L=k[1],Q=Object(s.useState)(!0),_=Object(g.a)(Q,2),F=_[0],T=_[1],z=Object(s.useState)(0),B=Object(g.a)(z,2),M=B[0],D=B[1],U=function(){var e=Object(f.a)(v.a.mark((function e(){var t;return v.a.wrap((function(e){for(;;)switch(e.prev=e.next){case 0:return d(!0),T(!1),e.next=4,q.a.get(I.urls.questions+"q/m");case 4:t=e.sent,A.dispatch(S(t.data)),r(J(t.data)),L(0),D(0),y([]),O(0),d(!1);case 12:case"end":return e.stop()}}),e)})));return function(){return e.apply(this,arguments)}}(),H=function(){var e=h+1;60===e?(T(!0),D(C)):O(e)};return Object(j.jsx)("div",{className:"Easy",children:Object(j.jsxs)("div",{className:"Wrapper",children:[F&&0===M?Object(j.jsxs)(j.Fragment,{children:[Object(j.jsx)("h1",{children:"FULLSTACK QUIZ"}),Object(j.jsx)("span",{id:"span2",children:"(Medium-60)"}),Object(j.jsx)("span",{id:"span11",children:"click play to get started!"}),Object(j.jsx)("button",{className:"myButton start",onClick:U,children:"\u25b6"})]}):null,F&&0!==M&&Object(j.jsxs)(j.Fragment,{children:[Object(j.jsx)("div",{className:"bluring",children:Object(j.jsxs)("span",{id:"finalScore",children:["Your final is score is ",Object(j.jsx)("br",{}),Object(j.jsxs)("span",{id:"reddish",children:[C,"/60"]}),"  ",Object(j.jsx)("br",{})," Try again!"]})}),Object(j.jsx)("button",{className:"myButton start",onClick:U,children:"retry"})]}),l&&Object(j.jsx)("div",{children:Object(j.jsx)(E,{msg:"Loading questions.."})}),F?null:Object(j.jsxs)("p",{className:"score",children:["Score: ",C]}),!l&&!F&&Object(j.jsx)(R,{question:null===(e=i[h])||void 0===e?void 0:e.question,userAnswer:w?w[h]:void 0,questionNr:h+1,totalQuestions:60,answers:J(null===(t=i[h])||void 0===t?void 0:t.options),callback:function(e){if(!F){var t,n,s,c=e.currentTarget.value,r=(null===(t=i[h])||void 0===t?void 0:t.answer)===c;r&&L((function(e){return e+1}));var a={question:null===(n=i[h])||void 0===n?void 0:n.question,answer:c,correct:r,correctAnswer:null===(s=i[h])||void 0===s?void 0:s.answer};y((function(e){return[].concat(Object(m.a)(e),[a])}))}}}),F||l||w.length!==h+1||h+1===60?F||l||h+1!=60?null:Object(j.jsx)("button",{className:"next",onClick:H,children:"Finish"}):Object(j.jsx)("button",{className:"next",onClick:H,children:"Next Question"})]})})};n(97);var V=function(){return Object(j.jsxs)("div",{className:"QuestionsLinks",children:[Object(j.jsx)("h1",{id:"niceTitle",children:"Links"}),Object(j.jsx)("h1",{id:"niceTitle2",children:"Here is a list of all the questions+answers source links "}),Object(j.jsx)("h1",{id:"niceTitle2",children:"just click on the name!!"}),Object(j.jsxs)("table",{children:[Object(j.jsx)("thead",{children:Object(j.jsx)("tr",{children:Object(j.jsx)("th",{children:"Name"})})}),Object(j.jsxs)("tbody",{children:[Object(j.jsx)("tr",{id:"java",children:Object(j.jsxs)("td",{id:"idLinks",children:[Object(j.jsx)("a",{href:"https://www.examtiger.com/mcq/java-programming-questions-answers/",target:"__blank",rel:"noreferrer",children:"Java questions+answers "})," "]})}),Object(j.jsx)("tr",{id:"java",children:Object(j.jsx)("td",{id:"idLinks",children:Object(j.jsx)("a",{href:"https://www.javatpoint.com/java-mcq",target:"__blank",rel:"noreferrer",children:"Java questions+answers 2"})})}),Object(j.jsx)("tr",{id:"java",children:Object(j.jsxs)("td",{id:"idLinks",children:[Object(j.jsx)("a",{href:"https://www.javamadesoeasy.com/2015/10/threadmulti-threading-quiz-in-java-mcq.html",target:"__blank",rel:"noreferrer",children:"Java threads questions+answers"})," "]})}),Object(j.jsx)("tr",{id:"spring",children:Object(j.jsx)("td",{id:"idLinks",children:Object(j.jsx)("a",{href:"https://tutorialslink.com/mcq-quiz/java-spring-and-spring-boot-mcq-quiz-multiple-choice-questions-and-answers?page=1",target:"__blank",rel:"noreferrer",children:"Spring questions+answers "})})}),Object(j.jsx)("tr",{id:"spring",children:Object(j.jsx)("td",{id:"idLinks",children:Object(j.jsx)("a",{href:"https://www.tutorialspoint.com/spring/spring_online_quiz.htm",target:"__blank",rel:"noreferrer",children:"Spring questions+answers 2"})})}),Object(j.jsx)("tr",{id:"spring",children:Object(j.jsx)("td",{id:"idLinks",children:Object(j.jsx)("a",{href:"https://www.interviewmocks.com/spring-mcq/",target:"__blank",rel:"noreferrer",children:"Spring questions+answers 3"})})}),Object(j.jsx)("tr",{id:"spring",children:Object(j.jsx)("td",{id:"idLinks",children:Object(j.jsx)("a",{href:"https://www.sanfoundry.com/1000-spring-questions-answers/#spring-web-flow-spring-mvc-spring-rest-spring-flex",target:"__blank",rel:"noreferrer",children:"Spring MVC questions+answers"})})}),Object(j.jsx)("tr",{id:"web",children:Object(j.jsx)("td",{id:"idLinks",children:Object(j.jsx)("a",{href:"http://www.allindiaexams.in/engineering/cse/typescript-mcq-quiz-typescript-online-test",target:"__blank",rel:"noreferrer",children:"TypeScript questions+answers"})})}),Object(j.jsx)("tr",{id:"web",children:Object(j.jsxs)("td",{id:"idLinks",children:[" ",Object(j.jsx)("a",{href:"https://www.javatpoint.com/reactjs-mcq",target:"__blank",rel:"noreferrer",children:"React Js questions+answers"})]})})]})]})]})},Z=(n(98),n(54)),G=n(21),X=n(53),$=new(function(){function e(){Object(N.a)(this,e),this.notification=new X.a({duration:2e3,position:{x:"left",y:"top"}})}return Object(G.a)(e,[{key:"success",value:function(e){this.notification.success(e)}}]),e}()),ee=n(55);var te=function(){var e,t,n,s,c,i,r,a,o=Object(ee.a)(),l=o.register,d=(o.handleSubmit,o.formState.errors),b=Object(u.g)();return Object(j.jsxs)("div",{className:"SendIdeas",children:[Object(j.jsx)("h1",{id:"niceTitle",children:"Send me an Email"}),Object(j.jsxs)("div",{className:"customCont ",children:[Object(j.jsx)("form",{onSubmit:function(e){Z.a.sendForm("service_6h66g8s","my-template",e.target,"user_2yCwRHQGK7r7v89rC1FRK").then((function(e){console.log(e.text)}),(function(e){console.log(e.text)})),e.target.reset(),$.success("your ideas were sent successfully , thanks!"),b.push("/home")},children:Object(j.jsxs)("div",{className:"row pt-5 mx-auto",children:[Object(j.jsxs)("div",{className:"col-8 form-group mx-auto",children:[Object(j.jsx)("input",Object(y.a)({type:"text",className:"form-control",placeholder:"Name",name:"name"},l("name",{required:!0,minLength:2}))),Object(j.jsx)("br",{}),"required"===(null===(e=d.name)||void 0===e?void 0:e.type)&&Object(j.jsx)("span",{id:"errors",children:"missing name"}),"minLength"===(null===(t=d.name)||void 0===t?void 0:t.type)&&Object(j.jsx)("span",{id:"errors",children:"name is too short"})]}),Object(j.jsxs)("div",{className:"col-8 form-group pt-2 mx-auto",children:[Object(j.jsx)("input",Object(y.a)({type:"email",className:"form-control",placeholder:"Email Address",name:"email"},l("email",{required:!0,minLength:2}))),Object(j.jsx)("br",{}),"required"===(null===(n=d.email)||void 0===n?void 0:n.type)&&Object(j.jsx)("span",{id:"errors",children:"missing email"}),"minLength"===(null===(s=d.email)||void 0===s?void 0:s.type)&&Object(j.jsx)("span",{id:"errors",children:"email is too short"})]}),Object(j.jsxs)("div",{className:"col-8 form-group pt-2 mx-auto",children:[Object(j.jsx)("input",Object(y.a)({type:"text",className:"form-control",placeholder:"Subject",name:"subject"},l("subject",{required:!0,minLength:2}))),Object(j.jsx)("br",{}),"required"===(null===(c=d.subject)||void 0===c?void 0:c.type)&&Object(j.jsx)("span",{id:"errors",children:"missing subject"}),"minLength"===(null===(i=d.subject)||void 0===i?void 0:i.type)&&Object(j.jsx)("span",{id:"errors",children:"subject is too short"})]}),Object(j.jsxs)("div",{id:"blackk",className:"col-8 form-group pt-2 mx-auto ",children:[Object(j.jsx)("textarea",Object(y.a)({className:"form-control",id:"",cols:30,rows:8,placeholder:"Your message",name:"message"},l("message",{required:!0,minLength:10}))),Object(j.jsx)("br",{}),"required"===(null===(r=d.subject)||void 0===r?void 0:r.type)&&Object(j.jsx)("span",{id:"errors",children:"missing message"}),"minLength"===(null===(a=d.subject)||void 0===a?void 0:a.type)&&Object(j.jsx)("span",{id:"errors",children:"message is too short"})]}),Object(j.jsx)("div",{className:"col-8 pt-3 mx-auto",children:Object(j.jsx)("button",{type:"submit",className:"btn btn",children:"Send Message"})})]})}),Object(j.jsx)("button",{id:"btnnn",onClick:function(){return b.push("/home")},children:"\u21a9"})]})]})};var ne=function(){return Object(j.jsx)("div",{className:"Routing",children:Object(j.jsxs)(u.d,{children:[Object(j.jsx)(u.b,{path:"/home",component:x,exact:!0}),Object(j.jsx)(u.b,{path:"/about",component:b,exact:!0}),Object(j.jsx)(u.b,{path:"/level",component:h,exact:!0}),Object(j.jsx)(u.b,{path:"/easy",component:K,exact:!0}),Object(j.jsx)(u.b,{path:"/medium",component:W,exact:!0}),Object(j.jsx)(u.b,{path:"/hard",component:P,exact:!0}),Object(j.jsx)(u.b,{path:"/questions",component:V,exact:!0}),Object(j.jsx)(u.b,{path:"/sendIdeas",component:te,exact:!0}),Object(j.jsx)(u.a,{from:"/",to:"home",exact:!0}),Object(j.jsx)(u.a,{from:"",to:"home",exact:!0}),Object(j.jsx)(u.a,{from:"/*",to:"home",exact:!0})]})})};n(99);var se=function(){return Object(j.jsx)(l.a,{children:Object(j.jsxs)("section",{children:[Object(j.jsx)(o.a,{type:"thick",bg:!0}),Object(j.jsx)("header",{children:Object(j.jsx)(d,{})}),Object(j.jsx)("main",{children:Object(j.jsx)(ne,{})})]})})};r.a.render(Object(j.jsx)(c.a.StrictMode,{children:Object(j.jsx)(se,{})}),document.getElementById("root")),a()},60:function(e,t,n){},61:function(e,t,n){},68:function(e,t,n){},69:function(e,t,n){},70:function(e,t,n){},90:function(e,t,n){},94:function(e,t,n){},95:function(e,t,n){},96:function(e,t,n){},97:function(e,t,n){},98:function(e,t,n){},99:function(e,t,n){}},[[100,1,2]]]);
//# sourceMappingURL=main.463fc93f.chunk.js.map