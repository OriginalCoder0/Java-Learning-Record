## Description

在学习数值交换的过程中，有很多方法，将连个数值进行交换，比如使用中间变量。那么，除了使用中间变量还有别的方法吗？

下面将带给大家三种使用数值交换的方法，不使用临时中间变量将两个数值进行交换。虽然下面是通过C语言实现的，但是在算法的思路上都是可以转换成不同的语言的。

```cpp
#include<bits/stdc++.h>
using namespace std;
void swap1(int &a,int &b)
{
    a = a + b;
    b = a - b;
    a = a - b;
}
void swap2(int &a,int &b)
{
    a = a * b;
    b = a / b;
    a = a / b;
}
void swap3(int &a,int &b)
{
    a = a ^ b;
    b = a ^ b;
    a = a ^ b;
}
int main()
{
    int a, b;
    scanf("%d%d",&a,&b);
    swap1(a,b);
    printf("a = %d\t,b =%d\n",a,b);
    return 0;
}

```

