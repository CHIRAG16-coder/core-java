package com.nit.BLCELC;

public class Nit 
{
     int studentId;
     String studentName;
     String studentBatchNo;
     double studentFee;
     
     
     public void setStudentInfo(int id ,String name,String batch,double fee )
     {
    	 studentId = id;
    	 studentName = name;
    	 studentBatchNo = batch;
    	 studentFee = fee;
     }
     
     public void getStudentData()
     {
    	 System.out.println("------------Student Info-------------");
    	 System.out.println("Student ID    : "+studentId);
    	 System.out.println("Student Name  : "+studentName);
    	 System.out.println("Student Batch : "+studentBatchNo);
    	 System.out.println("Student Fee   : "+studentFee);
     }
}
