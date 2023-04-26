package DIstudyspring.di.ui;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import DIstudyspring.di.entity.*;

@Controller("console")
public class InlineExamConsole implements ExamConsole {
	@Autowired
	//@Qualifier("exam")
	private Exam exam;

	public InlineExamConsole() {
	}

	public InlineExamConsole(Exam exam) {
		this.exam = exam;
	}

	@Override
	public void print() {
		if (exam == null) {
			System.out.printf("total is %d, avg is %f\n", 0, 0.0);
		} else {
			System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());
		}
	}

	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
	}
}
