package org.yarlithub.yschool.repository.model.obj.yschool.iface;
import java.util.Set;
import org.yarlithub.yschool.repository.model.obj.yschool.Classroom;
import org.yarlithub.yschool.repository.model.obj.yschool.Student;
import org.yarlithub.yschool.repository.model.obj.yschool.StudentClassroomModule;


/** 
 * Object interface mapping for hibernate-handled table: classroom_student.
 * @author autogenerated
 */

public interface IClassroomStudent {



    /**
     * Return the value associated with the column: classroomIdclassroom.
	 * @return A Classroom object (this.classroomIdclassroom)
	 */
	Classroom getClassroomIdclassroom();
	

  
    /**  
     * Set the value related to the column: classroomIdclassroom.
	 * @param classroomIdclassroom the classroomIdclassroom value you wish to set
	 */
	void setClassroomIdclassroom(final Classroom classroomIdclassroom);

    /**
     * Return the value associated with the column: id.
	 * @return A Integer object (this.id)
	 */
	Integer getId();
	

  
    /**  
     * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	void setId(final Integer id);

    /**
     * Return the value associated with the column: studentClassroomModule.
	 * @return A Set&lt;StudentClassroomModule&gt; object (this.studentClassroomModule)
	 */
	Set<StudentClassroomModule> getStudentClassroomModules();
	
	/**
	 * Adds a bi-directional link of type StudentClassroomModule to the studentClassroomModules set.
	 * @param studentClassroomModule item to add
	 */
	void addStudentClassroomModule(StudentClassroomModule studentClassroomModule);

  
    /**  
     * Set the value related to the column: studentClassroomModule.
	 * @param studentClassroomModule the studentClassroomModule value you wish to set
	 */
	void setStudentClassroomModules(final Set<StudentClassroomModule> studentClassroomModule);

    /**
     * Return the value associated with the column: studentIdstudent.
	 * @return A Student object (this.studentIdstudent)
	 */
	Student getStudentIdstudent();
	

  
    /**  
     * Set the value related to the column: studentIdstudent.
	 * @param studentIdstudent the studentIdstudent value you wish to set
	 */
	void setStudentIdstudent(final Student studentIdstudent);

	// end of interface
}