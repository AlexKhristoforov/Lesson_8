@>nul MD ".\comp

@>nul javac -sourcepath ./src  -d  comp  src/*.java  

java -cp comp Main   
@>nul RD /s/q ".\comp
     
pause