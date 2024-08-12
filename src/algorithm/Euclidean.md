유클리드 호제법
============

> 두 수의 '최대공약수(GCD)'를 찾기 위한 알고리즘
> 큰 수를 작은 수로 나누어 떨어지게 한 뒤, 수를 반복적으로 수행하여 나머지 0이 될때까지 작동하는 방법

***
### 최대공약수 (GCD: Greatest Common Divisor)

#### 1. 재귀 방식으로 구현
```java
public static int gcd(int a, int b) {
    if (b == 0) return a;
    return gcd(b, a % b);
}
```

#### 2. 반복문 방식으로 구현
```java
public static int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
```

***
### 최소공배수 (LCM: Least COmmon Multiple)

#### 최대공약수의 함수를 기반으로 최소공배수 구현
```java
public static int lcm(int a, int b) {
    return a * b / gcd(a, b);
}
```

***
### N수의 최대공약수, 최소공배수 구현

#### 1. 최대공약수(GCD) 구현
```java
public static int gcd(int[] arr) {
    int result = arr[0];
    for (int i = 1; i < arr.length; i++) {
        result = gcd(result, arr[i]);
    }
    retrun result;
}

public static int gcd(int a, int b) {
    if (b ==0) return a;
    return gcd(b, a % b);
}
```

#### 2. 최소공배수(LCM) 구현
```java
public static int lcm(int[] arr) {
    int result = arr[0];
    for (int i = 1; i < arr.length; i++) {
        result = lcm(result, arr[i]);
    }
    return result;
}

public static int lcm(int a, int b) {
    return (a * b) / gcd(a, b);
}
```