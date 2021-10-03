run:
	@if [ $(lab) == 1 ];\
	then\
		javac lab_$(lab)/Task$(task).java -d dist && java -cp ./dist lab_$(lab)/Task$(task);\
	else\
		javac lab_$(lab)/task_$(task)/Main.java -d dist && java -cp ./dist lab_$(lab)/task_$(task)/Main;\
	fi