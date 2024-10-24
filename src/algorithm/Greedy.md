그리디 알고리즘
===========

### 탐욕법, Greedy Algorithm

> 최적의 값을 구해야 하는 상황에서 사용되는 근시안적인 방법론   
> 각 단계에서 최적이라고 생각되는 것을 선택   
> 항상 최적의 값을 보장하는 것이 아니라 최적의 값의 근사한 값을 목표

### 1. 탐욕 선택 속성(Greedy Choice Property)
***
각 단계에서 최선의 선택을 했을 떄 전체 문제에 대한 최적해를 구할 수 있는 경우


### 2. 최적 부분 구조(Optional Substructure)
***
전체 문제의 최적해가 무분 문제의 최적해로 구성될 수 있는 경우

## 그리디 알고리즘 단계

> 1. 문제의 최적해 구조를 결정합니다.
> 2. 문제의 구조에 맞게 선택 절차를 정의합니다 : **선택 절차(Selection Procedure)**
> 3. 선택 절차에 따라 선택을 수행합니다.
> 4. 선택된 해가 문제의 조건을 만족하는지 검사합니다 : **적절성 검사(Feasibility Check)**
> 5. 조건을 만족하지 않으면 해당 해를 제외합니다.
> 6. 모든 선택이 완료되면 해답을 검사합니다 : **해답 검사(Solution Check)**
> 7. 조건을 만족하지 않으면 해답으로 인정되지 않습니다.