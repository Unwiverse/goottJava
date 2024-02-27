--member라는 테이블을 만들어보자

create table member(
    memno number primary key, --회원번호
    memid varchar2(20) not null, --회원 아이디
    memname varchar(30) not null, --회원 이름
    mempwd varchar(20) not null, --회원 비번
    age number,                     --회원 나이
    mileage number,                 --회원 마일리지
    job varchar2(30)            --회원 직업
    );
    --member 테이블에 회원 정보를 저장해보자.
    insert into member 
        values(1, 'id1', '김관진', '1234', 54, 0, '학생');
    insert into member 
        values(2, 'id2', '추미애', '4312', 81, 17, '나무꾼');
    insert into member 
        values(3, 'id3', '신상우', '3123', 54, 55, '대학생');
    insert into member 
        values(4, 'id4', '박경태', '7782', 28, 0, '나그네');
    insert into member 
        values(5, 'id5', '최현석', '0521', 14, 1721, '은행장');
    insert into member 
        values(6, 'id6', '최에스더', '0528', 35, 88, 'MMA선수');
    insert into member 
        values(7, 'id7', '엄승현', '3391', 26, 0, '재벌');
    
  -- 카테고리 테이블을 만들어 보자.
create table category(
    cnum number unique,                        -- 카테고리 번호
    category_code varchar2(8),                 -- 카테고리 코드
    category_name varchar2(30) not null,       -- 카테고리 이름
    primary key(category_code)
);

-- 카테고리 테이블에 데이터를 저장해 보자.
insert into category values(1, '00010000', '전자제품');
insert into category values(2, '00010001', 'TV');
insert into category values(3, '00010002', '컴퓨터');
insert into category values(4, '00010003', '노트북');
insert into category values(5, '00010004', '에어컨');
insert into category values(6, '00020000', '의류제품');
insert into category values(7, '00020001', '남방');
insert into category values(8, '00020002', '속옷');
insert into category values(9, '00020003', '바지');
insert into category values(10, '00030000', '도서');
insert into category values(11, '00030001', '컴퓨터도서');
insert into category values(12, '00030002', '소설');

-- 상품 정보 테이블을 만들어 보자.
create table products(
    pnum number(11) primary key,                   -- 제품 번호
    category_fk varchar2(8) not null,              -- 카테고리 코드
    products_name varchar2(50) not null,           -- 제품명
    ep_code_fk varchar2(5) not null,               -- 제품 코드
    input_price number(10) default 0 not null,     -- 제품 입고 가격
    output_price number(10) default 0 not null,    -- 제품 출고 가격
    trans_cost number(5) default 0 not null,       -- 제품 배송비
    mileage number(6) default 0 not null,          -- 제품 마일리지
    company varchar2(30),                          -- 제품 제조사
    constraint category_ref foreign key(category_fk) 
        references category(category_code)
);

-- 제품 데이터를 저장해 보자.
insert into products
   values(1, '00010001', 'S 벽걸이 TV', '00001', 5000000, 8000000, 0, 100000, '삼성');
insert into products
   values(2, '00010001', 'L TV', '00002', 1000000, 1500000, 0, 50000, 'LG');
insert into products
   values(3, '00010004', 'S 에어컨', '00001', 1000000, 1100000, 5000, 100000, '삼성');
insert into products
   values(4, '00010000', 'C 밥솥', '00003', 200000, 220000, 5500, 0, '쿠쿠');
insert into products
   values(5, '00010004', 'L 에어컨', '00003', 1200000, 1300000, 0, 0, 'LG');
insert into products
   values(6, '00020001', '남성난방', '00002', 100000, 150000, 2500, 0, '');
insert into products
   values(7, '00020001', '여성난방', '00002', 120000, 200000, 0, 0, '');
insert into products
   values(8, '00020002', '사각팬티', '00002', 10000, 20000, 0, 0, '보디가드');
insert into products
   values(9, '00020003', '멜빵바지', '00002', 15000, 18000, 0, 0, '');
insert into products
   values(10, '00030001', '무따기 시리즈', '00001', 25000, 30000, 2000, 0, '길벗');

-- 문제: member 테이블에서 회원 이름과 나이, 직업 ㄱ
    select memname, age, job from member;
-- 문제: products 테이블에서 제품명, 입고가, 출고가, 제조사를 화면에 ㄱ
--    select product_name, input_price, output_price, company from products;
        
-- king 사원의 연봉은 60000입니다.
-- ||: 오라클에서 연결 연산자.
    select ename || '사원의 연봉은' || sal*12 || '입니다' as "직원의 연봉" from emp;
    
    select memname || '회원의 직업은' || job || '이고, 마일리지는' || mileage || '입니다' from member;
    

    
    --테이블 삭제 방법
    -- drop table 테이블명 purge; 
    
    /*
        ★★★★★★★★★★★★★★★★★★★★★★★
        where 조건절
        - 모든 데이터를 조회하는게 아니고 사용자가 원하는
        데이터만 조회할 때 사용함.
        - where 조건절은 자료를 필터링할 때 쓰는 키워드.
        - where 조건절은 from 테이블 이름 뒤에 기술해야함.
        형식) select 컬럼명1, 2, 3
            from 테이블이름 where 조건식;
        
        조건식에 들어가는 내용
        1) = : 조건이 같은지 확인
        2) < : 조건이 작은지 여부 확인
        3) <= : 조건이 작거나 같은지 여부 확인
        4) > : 조건이 큰지 여부 확인
        5) >= : 조건이 크거나 같은지 확인
        6) !=, <> : 조건 같지 않은지 확인
        7) between A and B: A와 B 사이에 있는지 여부 확인.
        8) in(list): list 값 중에 어느 하나와 일치하는지 여부 확인.
        9) not between A and B: A와 B 사이에 없는지 확인.
        10) not in(list): list값과 일치 안하는지 확인.
    */
    --emp 테이블에서 담당업무가 'manager'인 사원의 모든 정보를 화면에 ㄱ
    select * from emp where job = 'MANAGER';
    
    -- emp 테이블에서 담당업무가 'SALESMAN'인 사원의 모든정보를 화면에 ㄱ
    select * from emp where job = 'SALESMAN';
    
    --문제) emp 테이블에서 보너스가 300, 500, 1400인 사원의 모든 정보 화면에 ㄱ
    select * from emp where COMM between 1 and 1400;
    
    select * from member where memname = '김관진' and job = '학생';
    /*
    문제) product 테이블에서 제조사가 '삼성' 또는 '현대' 이면서 입고가가 100만원
          이하인 상품의 상품명과 입고가, 출고가를 화면에 ㄱ
    */
    /*
    select product_name, input_price, output_price from products where company
    in ('삼성', '현대') and output <=1000000;
    */
    /*
    문제) emp 테이블에서 급여가 1100 이상에 담당업무가 MANAGER인 사원의 사번, 이름
          담당업무, 급여를 화면에 ㄱ
    */
    select empno, ename, job, sal from emp where sal >= 1100 and job ='MANAGER';
    
    /*
    ★★★★★★★★★★★★★★★★★★★★
    like 키워드: 검색 키워드
    1) where ename like '%S%' ==> ename 칼럼에 s자를 포함하는 사원 이름 검색
    2) where ename like 'S%' ==> ename 컬럼에 s자로 시작하는 사원의 이름을 검색.
    3) where ename like '%S' ==> ename 컬럼에 마지막 글자가 s자로 끝나는 사원 이름 검색
    4) where enmae like '_S%' ==> ename 컬럼에 두번째 글자가 s자를 포함하는 사원 이름 검색.
    */
    
    --emp 테이블에서 사원명에 a라는 글자를 포함하는 사원의 모든 정보를 보여주세요.
    select job from emp where ename like '%A%'; 
    --문제) emp 테이블에서 사원명에 'M'이라는 글자를 포함하는 사원의 모든 정보를 화면에 ㄱ
    select * from emp where ename like '%M%';
    --문제) emp 테이블에서 사원명에 'S'라는 글자로 끝나는 사원의 모든 정보를 화면에 ㄱ
    select * from emp where ename like '%S';
    --문제) emp 테이블에서 사원명의 두 번째 글자에 'I'라는 글자를 포함하는 사원의 모든 정보를 화면에 ㄱ
    select * from emp where ename like '_I%';
    --문제) emp 테이블에서 입사년도가 82년도인 사원의 사번, 이름, 담당업무, 입사일자를 화면에 ㄱ
    select empno, ename, job, hiredate from emp where hiredate like '%82%';
    --문제) member 테이블에서 비번이 '3'으로 시작하는 회원의 이름, 나이, 비번을 화면에 ㄱ
    select memname, age, mempwd from member where mempwd like '3%';
    
    select * from member where memname like '김%';
    
    /*
      ★★ ★ ★ ★ ★ ★ ★ ★ ★ ★★★★  
      order by 절
      - 자료를 정렬하여 나타낼 때 사용하는 명령어.
      - order by 절을 쓸 때는 select 구문의 맨 마지막에 위치해야함.
      - acs: 오름차순 정렬
      - desc: 내림차순 정렬
      - 기본적으로 order by 절을 사용 할 땐 오름차순 정렬이 default임.
      - 오름차순 정렬인 경우엔 asc를 생략 가능.
    */
    -- 멤버 테이블에서 이름을 기준으로 오름차순 정렬해서 모든 정보를 화면에 ㄱ
    
    select * from member order by memname asc;
    -- 단, 이름이 같을 땐 나이를 기준으로 내림차순 정렬.
    select * from member order by memname, age desc;
    
    --문제) emp 테이블서 부서번호를 기준으로 오름차순 정렬하고 부서번호가 같을 땐
    --      급여를 기준으로 내림차순 정렬해서 화면에 ㄱ
    select * from emp order by deptno asc;
    select * from emp order by deptno, sal desc;
    
    --문제) emp 테이블에서 급여가 1100 이상인 사원들의 정보를 보여주되 입사일자가 빠른 순으로
    --      정렬해서 화면에 ㄱ
    select * from emp where sal >= 1100 order by hiredate asc;
    
    --문제) emp 테이블에서 부서번호를 기준으로 오름차순 정렬하여 나타내고
    --      부서번호가 같으면 담당업무를 기준으로 오름차순해서 정렬. 만약 담당업무가
    --      같으면 급여가 많은데서 적은 순으로 정렬하여 화면에 ㄱ
    --select * from emp order by deptno, sal desc;
    select * from emp order by deptno, job asc, sal desc;
   
    /*
        not 키워드: 부정. 
        - 부정을 처리하는 경우엔 일단은 긍정 쿼리문 작성 후
          부정 의미인 not 붙이기.
    
    */
    -- emp 테이블에서 담당업무가 manager, clerk, analyst가 아닌 사원의 사번, 이름, 담당업무, 급여 화면에 ㄱ
    select empno, ename, job, sal from emp where job not in('MANAGER', 'ANALYST', 'CLERK');
    
    --문제) emp 테이블에서 이름에 'S'자가 들가지 않는 사원 이름과 담당업무를 화면에 ㄱ
    select ename, job from emp where ename not like '%S%';
    
    --문제) emp 테이블에서 부서번호가 10번 부서가 아닌 사원의 이름, 담당업무, 부서번호를 화면에 ㄱ
    select ename, job, deptno from emp where deptno not in('10');
    
    --문제) emp 테이블에서 보너스가 null이 아닌 사원의 모든 정보를 화면에 ㄱ
    select * from emp where comm not like '%null%';
    
    /*
    ★★★★★★★★★★★★★★★★★★
    사용자 계정을 만드는 법
    - create user 사용자 계정명 identify by 비밀번호
    - 만들어진 계정을 쓰기 위해 권한을 설정.
    - grant connect, resource to 사용자계정명;
    
    - role: 사용자에게 보다 효율적으로 권한을 부여할 수 있게 여러개의 권한을 묶어놓은 걸 말함.
    - connect role ==>  오라클에 접속할 수 있는 세션 설정 및 사용자가 DB 접속이 되게하기 위해 
                        가장 기본적인 시스템 권한을 묶어놓은 걸 말함.
    - resource role ==> 사용자가 테이블을 생성할 수 있게하기 위해서 시스템 권한을 묶어놓은 걸 말함.
                        또한 insert, update, delete 구문을 사용할 수 있는 권한을 묶어놓은 걸 말함.
    
    */
    /*
    그룹함수 ==> 여러 행 또는 테이블 전체에 대해 함수가 적용되어
                하나의 결과값을 가져오는 함수.
    1) avg(): 평균값을 구하는 함수.
    2) count(): 행(레코드)의 개수를 구하는 함수.
                => null값은 무시하고 행의 개수를 구함.
    3) min(): 최소값 구하기 함수.
    4) max(): 최대값 구하기.
    5) sum(): 총 합 구하기.
    */
    
    -- emp) 테이블에서 사번을 갖고 있는 모든 사원의 수를 구해서 화면에 ㄱ
    select count(empno) as chang from emp;
    
    --문제) emp 테이블에서 관리자(mgr)의 수를 구해서 화면에 ㄱ
    select count(distinct mgr) as mgrnum from emp;
    
    --문제) emp 테이블에서 모든 salesman의 급여 평균과 급여 최고액, 최저액, 합계액을 구해서
    -- 화면에 ㄱ
    select avg(sal), max(sal), min(sal), sum(sal) from emp where job = 'SALESMAN';  
    
    
    
    
    
    
