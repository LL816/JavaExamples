ObserverPattern: 
Subject(主体，类似于新闻出版社，本身更新信息，并需要将信息传递给订阅该家报社报纸的读者们)；
Observer（观察者，对应订阅报纸的读者，接受Subject的更新）

分别为二者创建接口，再定义相应类，可实现一个subjec对应多个observer，一旦更新，统一收到
Subject包括add\remove\notify observer的方法，observer包括update的方法
subject信息变化时调用notify函数，对应observer的update方法
创建observer时，调用subject的add方法，创建二者联系

该模式在java API中有以封装好的代码，但该定义中subject以Observable类的形式出现，
类不同于接口，必须继承，且只能继承一个，存在一定限制，不如自己定义接口来得方便。
