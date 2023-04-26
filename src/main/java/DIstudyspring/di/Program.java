package DIstudyspring.di;

import org.springframework.context.*;
import org.springframework.context.annotation.*;

import DIstudyspring.di.config.*;
import DIstudyspring.di.ui.*;

public class Program {
	public static void main(String[] args) {
		/* 스프링 지시하는 방법으로 코드를 변경
		Exam exam = new NewlecExam();
		ExamConsole console = new GridExamConsole(); //DI
		console.setExam(exam);
		console.print();
		
		//Exam exam = context.getBean(Exam.class);
		//System.out.println(exam.toString());
		*/
		
		//ExamConsole console = (ExamConsole) context.getBean("console");
		
		/*
		List<Exam> exams = (List<Exam>) context.getBean("exams");
		
		for(Exam e : exams) {
			System.out.println(e);
		}
		*/ 
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(NewlecDIConfig.class);
		ExamConsole console = (ExamConsole) context.getBean("console");
		
		console.print();
	}
}
