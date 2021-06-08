# 모의 담금질을 이용한 Parameter Estimation
`201801658 김현성` 

---

* `모의 담금질(Simulated Annealing) 기법`은 널리 사용되는 최적화 알고리즘들 중의 하나로서 커다란 탐색공간에서 주어진 함수의 전역 최적점 (global optimum)에 대한 훌륭한 근사치를 찾으려고 하는 전역최적화 (global optimization) 문제에 대한 일반적인 확률적 휴리스틱(probabilistic heuristic) 접근방식이다.  
  
### 모델 선정 (작동 구조)  
 ---
  
 * 모델을 어떤 걸 설정 할까 고민하다가 편의점 알바를 하면서 택배 상자의 무게에 따른 택배비를 기반으로 하였습니다. 
  
  ![image](https://user-images.githubusercontent.com/80371590/121253425-0d874680-c8e4-11eb-9616-c001de4773de.png)  
  
### 소스 코드  
  ---  
  
```java
public class Main {

    public static void main(String[] args) {

            // 000000
            // 010000

            SimulatedAnnealing sa = new SimulatedAnnealing(1, 0.97, 100);
            sa.solve(new Problem() {
                @Override
                public double fit(double x) {
                    return x*x*x; // or x*x*x*x...etc 원하는 함수 대입
                }

                @Override
                public boolean isNeighborBetter(double f0, double f1) {
                    return f1 > f0;
                }
            }, 1, 10);  // x값 범위 설정

            System.out.println(sa.hist);

        }
    }
  ```  
  * 함수를 대입하고 x값 범위를 직접 설정해준다. 수업 시간에 구현한 코드와 유사하다.  
  
  
### 그래프 표현
  ---
  
  ![image](https://user-images.githubusercontent.com/80371590/121256467-8cca4980-c8e7-11eb-90f3-5fd84594663b.png)
  
  * 가로축은 택배 무게이고, 세로축은 비용이다.
  * 회귀식은 y = 150x+1500 이다.  
    
### Parameter Estimation 결과
  ---  
  
![image](https://user-images.githubusercontent.com/80371590/121259342-f3049b80-c8ea-11eb-900f-5602732697fa.png)
  
![image](https://user-images.githubusercontent.com/80371590/121259458-1b8c9580-c8eb-11eb-834e-1e905658e01b.png)
  
  *  Simulated Annealing을 이용한 값들 중에 일부를 가져온 것이다.
  *  y=150x+1500 , a= 150 b = 1500 값에 거의 유사하다.
  *  오차를 고려해야한다.  
  
### Simulated Annealing 아쉬운 점 및 나아가는 방향  
  ---  
  
* 여러가지 찾는 속도나 사용하는 메모리의 경우에 대하여 아쉬운점이 있다. 그래서 여러 박사 과정의 분들이 새로운 기법을 추가하여 더욱 발전되어 기법을 찾아 내었다. 하지만 이 아이디어 자체는 모든 분야에 대하여 적용이 가능하다. 임의의 경우의 수가 많은 경우 정해진 조건에서 대용량의 최적화를 찾을 때 유용하게 사용이 된다.

### 번외  

 교수님! 1학기 동안 누구보다 열정적으로 가르쳐 주셔서 감사합니다. Git에 대한 기초 지식을 쌓을 수 있는 시간이였습니다.



  
  
