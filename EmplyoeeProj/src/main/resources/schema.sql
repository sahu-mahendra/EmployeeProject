DROP TABLE IF EXISTS EMPLYOEE;  

CREATE TABLE EMPLYOEE(
   id NUMBER(6) NOT NULL,
    first_name VARCHAR2(20),
    last_name VARCHAR2(25)  , 
    email VARCHAR2(25),
    phone_number VARCHAR2(20),
    hire_date DATE,
    salary NUMBER(8),
    manager_id NUMBER(6),
    department_id NUMBER(4)  ) ;
    
    
    
    CREATE TABLE IF NOT EXISTS DEPARTMENT
    
   ( department_id NUMBER(4)  NOT NULL UNIQUE,
   department_name VARCHAR2(30) NOT NULL,
   manager_id NUMBER(6) NOT NULL
   ) ;
   
ALTER TABLE department
    ADD ( 
   PRIMARY KEY(department_id)
   ) ;   