 /*
    group by 절
    - 특정 칼럼이나 값을 기준으로 해당 레코드를 묶어서 자료를 관리할 때 씀.
    - 보통은 특정 열을 기준으로 집계를 구하는데 많이 쓰임.
    - 또한 그룹함수와 함께 쓰면 효과적으로 활용 가능.
    */
    select distinct deptno from emp order by deptno;
    
    select deptno from emp group by deptno;
    --emp 테이블에서 부서별로 해당 부서의 인원을 확인하고 싶을 때
    select deptno, count(*) from emp group by deptno;
    
    --테이블에서 각 부서별로 부서직원의 급여 합계액 구해서 화면에 ㄱ
    select deptno, sum(sal) as coke from emp group by deptno
    order by sum(sal) desc;
    
    --문제) emp 테이블에서 부서별로 그룹을 지어 급여 합계랑 부서별 인원 수, 부서별 평균 급여
    --      최대급여, 최소급여 구해서 화면에 ㄱ
    select deptno, sum(sal), count(ename), avg(sal), max(sal), min(sal) from emp group by
    deptno order by deptno;
    
    /*
        having 절
        - group by 절 다음에 오는 조건절.
        - ★★★★★★★group by 절 다음에는 where(조건절)이 못옴.★★★★★★★
        - 반드시 group by 질의 결과에  조건을 줘서 제한 시에 씀.
    */
    
    -- products 테이블에서 카테고리 별로 상품의 개수를 구해서 화면에 ㄱ
    select category_fk, count(*)
    from products group by category_fk having count(*) >=2;
    
    /*
        ★★★★★★★★★★★★★★★★★★★★★★★★★★★★
        view 
        - 물리적인 테이블에 근거한 논리적인 가상의 테이블.
        - view는 실질적으로 데이터를 저장안하고있음.
        - view를 만들면 데이터베이스에 질의 시 실제 테이블에 접근해
          데이터를 갖고오게됨.
        - 간단하게 필요한 내용들만 추출해 사용할 때 많이 씀.
        - view는 테이블과 유사하고 테이블처럼 사용이 가능.
        - view는 테이블에 저장하기 위한 물리적인 공간이 필요가 없음.
        - 테이블과 마찬가지로 insert, update, delete 명령이 쌉가능.
        - 하지만 주로 데이터를 조회(select)할 때 가장 많이 쓰임.
        - view는 왜쓰냐?
            1) 보안 관리 때문에(중요) => 보안 등급에 맞춰 컬럼 범위를 정해 조회가 되게 할 수 있다.
            2) 사용자 편의성 제공
            
        형식) 
                create view 뷰 이름
                as 쿼리문;
    */
    -- 보안 관리 + 값 변경 및 삽입 없이 조회만을 위해서!
    -- 인사부 뷰
    -- 컬럼에 sal, comm(보너스), 컬럼 제외
    create view emp_insa as select empno, ename, job, mgr, hiredate, deptno
    from emp;
    
    select * from emp_insa;
    
    -- 영업부 view: sal 열 제외
    create view emp_sales as select empno, ename, job, mgr, hiredate, comm, deptno
    from emp;
    
    select * from emp_sales;
    
    -- 회계부 view: 제외 컬럼 없음
    create view emp_account as select * from emp;
    select * from emp_account;
    
    insert into emp_account --view에서도 테이블에 데이터 추가는 가능
        values(9000, 'ANGEL', 'SALESMAN', 7698, sysdate, 1300, 100, 30);
    
    -- view를 읽기전용으로 만들 경우 데이터 추가불가
    -- 읽기전용으로 만드는 방법.
    -- 읽기 전용으로 만들 때 쿼리문 맨 마지막에 'with read only'라고 추가.
    create view emp_view1 as select * from emp with read only;
    
    insert into emp_view1 values(9000, '엄승현', 'MANAGER', 7888, sysdate, 1500, 200, 30); -- 에러 발생
    
    -- create or replace view
    -- 같은 이름의 view가 있을 땐 기존 view는 삭제하고 새로운 view를 만들란 의미.
    create or replace view emp_sales as select empno, ename, job, mgr, hiredate, deptno
    from emp with read only;
    
    --2) 사용자 편의성 제공
    create or replace view emp_salary
    as select empno, ename,(sal*12+nvl2(comm, comm, 0)) "연봉"
    from emp with read only;
    
    select * from emp_salary;
    
    create or replace view emp_sample as select * from emp; 
    create or replace view dept_sample as select * from dept;

    -- [문제1] 부서별로 부서별 급여 합계, 부서별 급여 평균을 
-- 구한 view를 만들어 화면에 보여주세요.
-- 주의사항) view를 만들 때 그룹함수 사용시에는 반드시
--          별칭을 설정해 주어야 함.
    select sum(sal) "급여합계", avg(sal) "급여평균" from emp_sample 
    group by deptno;


-- [문제2] emp 테이블을 이용하여 emp_dept20 이라는 
-- view를 만들어 주세요. 단, 부서번호가 20번 부서에 속한
-- 사원들의 사번, 이름, 담당업무, 관리자, 부서번호만 
-- 화면에 보여주시기 바랍니다.
    create view emp_dept20 as select empno, ename, job, mgr, deptno from emp
    where deptno = '20';
    select * from emp_dept20;


-- [문제3] emp 테이블에서 각 부서별 최대급여와 최소급여를
-- 보여주는 view를 만들되, sal_view라는 이름으로 만들어
-- 화면에 보여주세요.
    create view sal_view as select deptno "부서번호", min(sal) "최소급여", max(sal) "최대급여" from emp
    group by deptno;
    select * from sal_view;
    


-- [문제4] 담당업무가 'SALESMAN' 인 사원의 사번, 이름,
-- 담당업무, 입사일, 부서번호를 컬럼으로 하는 view를 
-- 만들되, emp_sale 이라는 view를 만들어 화면에 보여주세요.
    create view emp_sale as select empno "사번", ename "이름", job "담당업무", hiredate "입사일",
    deptno "부서번호" from emp where job = 'SALESMAN';
    select *  from emp_sale;
    
    --view를 만들 때 컬럼만만들고 싶은 경우
    -- 조건을 줄 때 말도 안되는 조건 ㄱ
    CREATE OR REPLACE VIEW emp_view2 AS
    SELECT *
    FROM emp
    WHERE deptno = 1
    WITH READ ONLY;
    
        /*
        트랜젝션(Transaction)?
        -데이터 처리의 한 단위
        -오라클에서 발생하는 여러 개의 sql 명령문들을
        -하나의 논리적인 작업 단위로 처리하는 걸 말함.
        -All or Nothing 방식으로 처리함.
        -명령이 여러 개의집합이 정상적으로 처리가 되면 종료,
         여러 개의 명령어 중에서 하나라도 잘못되면
         전체를 취소 ㅋ(중요)
        - 쓰는이유: 데이터 일관성 유지 데이터 안정성 보장하기 위해 씀.
        - 트랜젝션 사용 시 트랜젝션을 제어하기 위한 명령어.
          1) 트랜젝션(insert, update, delete) 작업의 내용을
          실제 DB에 반영, 이전에 있던 데이터에 update 현상이 발생함.
          모든 사용자가 변경된 데이터의 결과를 볼수있음.
        2) rollback: 작업 중에 문제가 발생했을 때  트랜젝션(insert, update, delete) 
        처리 과정에서 변경 사항을 취소해 이전 상태로 되돌림.
        트랜젝션 작업 내용 취소.
        이전에 한 곳까지만 복구 가능.
        */
    --1. dept라는 테이블 복사 dept_02라는 테이블 ㄱ
    create table dept_02 as select * from dept;
    select * from dept_02;
    
    --2. dept_02 테이블애서 40번 부서를 삭제하고 commit ㄱ
    delete from dept_02 where deptno = 40;
    --3. dept_02 테이블의 전체 데이터를 삭제해보자.
    delete from dept_02;
    --4. 이 때 만약 20번 부서에대해서만 없애려고 했는데 잘못해서 전체가 없어져도 다시 복원 ㅆㄱㄴ
    rollback;
    --5. 이제 20번 부서에 대해서만 삭제하면 됨.
    delete from dept_02 where deptno ='20';
    --6. 데이터 베이스에 변경사항 저장
    commit;
    
    /*
    savepoint 
    - 트랜젝션을 작게 분할하는 걸 말함.
    - 사용자가 트랜젝션 중간 단계에서 프린트를 지정해서 트랜젝션 내의 특정 savepoint까지 rollback할 수
      있게 하는 것.
    */
    --1.  dept 테이블 복사 & dept_03 이라는 테이블 ㄱ
    create table dept_03 as select * from dept;
    
    --2. dept_03 테이블에서 40번 부서를 삭제하고 commit 하자.
    delete from dept_03 where deptno =40;
    
    --3. dept_03 테이블에서 30번 부서를 삭제 ㄱ
    delete from dept_03 where deptno = 30;
    
    --4. 이 때 savepoint sql을 설정 ㄱ 
    savepoint sp1; 
    
    --5. dept_03 테이블에서 20번 부서 삭제 ㄱ
    delete from dept_03 where deptno = 20;
    
    --6. 이 때 savepoint sql2를 설정 ㄱ
    savepoint sp2;
    --7. dept_03 테이블에서 10번 부서를 삭제해보자.
    delete from dept_03 where deptno =10;
    
    --sql 부서번호가 20번인 부서를 삭제하기 바로 전으로 되돌아가고싶을 때
    rollback sp1;
    select * from dept_03;