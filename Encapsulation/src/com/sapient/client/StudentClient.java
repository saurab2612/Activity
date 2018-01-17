package com.sapient.client;

import com.sapient.service.Student;

public class StudentClient {

	public static void main(String[] args) {
		Student st = new Student();
		st.setStuId(1);
		st.setStuName("Amar");
		st.setEng(90);
		st.setLang(95);
		st.setMaths(100);
		st.setSci(95);
		st.setSocial(85);
		System.out.println(st.display());
	}

}
