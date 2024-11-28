Демо 1:

Проверим, что используем java 23
```shell
java -version
javac -version
```

Скомпилируем
```shell
javac -d output/ src/calculator/*.java
```

Запустим
```shell
java -cp output/ calculator.Main
```

Демо 2:

Еще раз скомпилируем
```shell
javac -d output src/calculator/*.java
```

Перейдем в папку output
```shell
cd output/
```

Соберем в jar файл
```shell
jar -cf Calculator.jar calculator/*.class
```
