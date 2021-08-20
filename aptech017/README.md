#Mối quan hệ

oop -> inheritance: mối quan hệ kế thừa - mối quan hệ là một (is->a)
-> đây là mối quan hệ chung nhất (generalization)

---
association: đây là mối quan hệ giữa các class, không class nào sở hữu class nào, khi đối tượng này chết thì không 
ảnh hưởng đến class kia
####=> Sau đó tương tác một chiều (unidirection), hay nhiều chiều (bidirection)
####=> các mối quan hệ one to one, one to many, many to many

---
aggregation: mối quan hệ thu nạp - mối quan hệ có 1 (has-a)

```java
class A {}
class C {}
class B {
    A a; //mối quan hệ aggregation
    C c;
}
/*
 * có nghĩa là trong class B có khai báo đối tượng class A như là 1 field
 * => tương tác 1 chiều từ B đến A
 * => 2 đối tượng này tồn tại độc lập, nhưng 1 trong các đối tượng này là chủ sở hữu
 * => has a (one to one)
 */
```
---
composition: mối quan hệ một phần của (part-of) liên kết chặt chẽ (class A là một phần của class B)
