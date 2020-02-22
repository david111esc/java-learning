# [Issue 1] Object reference problems

## Problems
對於物件在程式執行中被引用的問題
1) 指向 null 的疑問
```java
Object A = new Object();
Object B = A;
A = null;
```
