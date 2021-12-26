### 첫번째 문제점은 각 정보를 배열로 설정해야한다. 

다른 한개의 데이터는 배열로 넣어줬다. 
여기서 문제는 book이였는데, 각 필드 안에 또 필드를 만들어서 배열을 넣었다. 
```
db.cuty.insert({"name":"Lim Hanna","age":23,"food":["Chocolate"],"color":["Green"],"book":{"bookname":["Third Humanity"],"publishing_house":["Open Books"], "author":["Bernard Werber"]}})
```

--------------------------------------------------------------------
```
db.cuty.find().pretty()
```
하면, 
```
{
  "name":"Lim Hanna",
  "age":23,
  "food":["Chocolate"],
  "color":["Green"],
  "book":{
    "bookname":["Third Humanity"],
    "publishing_house":["Open Books"], 
    "author":["Bernard Werber"]
   }
 }
)
```

이렇게 나온다. 
