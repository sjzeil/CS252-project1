bin/%.class: src/%.java
	javac -g -d bin -cp src:bin src/$*.java

median.jar: bin/cs252/TestMedian.class bin/cs252/Median.class
	jar cfe $@ cs252.TestMedian -C bin/ .

bin/cs252/TestMedian.class: src/cs252/TestMedian.java bin/cs252/Median.class

run: median.jar
	java -jar median.jar

clean:
	rm -r median.jar bin
