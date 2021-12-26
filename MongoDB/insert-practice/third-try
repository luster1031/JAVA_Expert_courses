# 문제점
1. 데이터베이스를 cuty로 하면 안된다. (edudb사용)
```
use cuty
```

2. book필드안에 각 필드에 배열을 넣으면 안된다. 
```
db.cuty.insert({"name":"Lim Hanna","age":23,"food":{"name":"Chocolate"},"color":{"name":"Green"},"book":[{"bookname":"Third Humanity","publishing_house":"Open Books", "author":"Bernard Werber"}]})
```
내용을 펼쳐 보면, 
```
{
  "name":"Lim Hanna",
  "age":23,
  "food":{"name":"Chocolate"},
  "color":{"name":"Green"},
  "book":
  [
    {
      "bookname":"Third Humanity",
      "publishing_house":"Open Books",
      "author":"Bernard Werber"
    }
  ]
 }
)
```
