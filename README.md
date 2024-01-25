# How to upload file in GitHub.

1. git init

2. git add .

3. git commit -m "first commit"

4. git branch -M main

5. git remote add origin https://github.com/Surajit17035/JDBC-Intermediate.git

6. git push -u origin main

## How to run this repo code in your Local Machine?
1. Download thi postgresql database (url: https://www.postgresql.org/download/)
2. Set database username = postgres and password = root. (Note: By default database username set as postgres and password you have to set.)
3. Download the postgresql jdbc jar and import in your project. (url: https://jdbc.postgresql.org/download/)
4. Now you have to configure the database >> follow the below steps...

  ### Configure the database
  1. Create a new database - demo
  2. Create a new table - student
  3. Create column in 'student' table >> sid, sname, marks

     ### Note: sid represent "Integer" value - student Id, sname represent "text" value - student name, marks represent "Integer" value - Marks got in exam

   ### Example of a Demo code:

//  

     String url = "jdbc:postgresql://localhost:5432/demo";

     // **jdbc** - Who will create the connection, **postgresql** - which database software, **localhost:5432** - where it will Run and port number, **demo** - database name.

     String user = "postgres";
     
     String password = "root";

    // SQL query which is going to execute in the database.

     String sql = "delete from student where sid=101";  

     // connection established
     
     Connection con = DriverManager.getConnection(url,user,password); 

     // sending sql statement to the database.
     
     Statement st = con.createStatement(); 

     // Execute the sql statement
     
     st.execute(sql); 

     // closing the connection
     
     con.close();  
