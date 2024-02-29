--member라는 테이블을 만들어보자
create table member(
    memno number primary key,          -- 회원 번호
    memid varchar2(20) not null,       -- 회원 아이디
    memname varchar2(30) not null,     -- 회원 이름
    mempwd varchar2(20) not null,      -- 회원 비밀번호
    age number,                        -- 회원 나이
    mileage number,                    -- 회원 마일리지
    job varchar2(30),                  -- 회원 직업
    addr varchar2(500),                -- 회원 주소
    regdate date not null              -- 회원 가입일
);


    -- member 테이블에 회원의 정보를 저장해 보자.
insert into member
    values(1, 'id1', '홍길동', '1111', 25, 0, '학생',
            '부산시 동래구', '2013-08-08');

insert into member
    values(2, 'kimkd', '김길동', '2222', 30, 1500, '회사원',
            '서울시 강남구', '2013-09-15');

insert into member
    values(3, 'id3', '공성현', '3333', 33, 10000, '회사원',
            '부산시 중구', '2013-09-09');
            
insert into member
    values(4, 'kimyh', '김영희', '4444', 18, 3000, '학생',
            '경상남도 마산시', '2014-05-23');
            
insert into member
    values(5, 'id5', '박말자', '5555', 45, 5000, '주부',
            '경기도 남양주시', '2013-12-01');

insert into member
    values(6, 'id6', '김철수', '6666', 55, 0, '교수',
            '제주도 서귀포시', '2013-01-10');

insert into member
    values(7, 'hong', '홍길동', '7777', 14, 0, '학생',
            '경상북도 경주시', '2013-12-25');

insert into member
    values(8, 'id8', '김상현', '8888', 31, 0, '무직',
            '서울시 마포구', '2013-04-22');

insert into member
    values(9, 'id9', '이지연', '9999', 25, 0, '학생',
            '강원도 강릉시', '2013-10-10');

insert into member
    values(10, 'id10', '홍길동', '1010', 52, 10000, '무직',
            '서울시 강북구', '2013-09-15');

    
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
    
    /*
    시퀀스(sequence) 
    ==> 순서를 부여할 때 사용하는 문법.
        연속적인 번호를 만들어주는 기능을 함.
        
    형식)
        create sequence 시퀀스이름
        start with n1시작번호 설정 - default 값 1;
        increament n1(시퀀스 최대 번호 설정)
        maxvalue n1(시퀀스 최대 번호 설정)
        minvalue n1(시퀀스 최소 번호 설정)
        cache/nocache(캐시 메모리 사용 여부, 생략 가능)
        
        1) cache: 시퀀스를 빠르게 제공하기 위해 미리 캐쉬 메모리에
                  시퀀스를 넣어두어 준비하고 있다가 시퀀스 작업이
                  필요할 때 사용함.
                  default로는 20개의 시퀀스를 캐시 메모리에 보관하게됨.
        2) nocache: cache 기능을 쓰지 않는다는 의미.
        
    */
    --memo라는 테이블
    create table memo(
    bunho number, 
    title varchar2(100) not null,
    writer varchar2(30) not null,
    cont varchar(1000) not null,
    regdate date,
    primary key(bunho)
    );
    -- memo 테이블에서 이용 시 사용할 시퀀스
    create sequence memo_seq
    start with 1
    increment by 1
    cache 20; 
    
    -- memo 테이블의 데이터 저장
    insert into memo values(memo_seq.nextval, '메모1', '홍길동', 'ㅋㅋㅋㅋ', sysdate);
    insert into memo values(memo_seq.nextval, '메모2', '이건일', '♥박순자', sysdate);
    insert into memo values(memo_seq.nextval, '메모3', '임성현', '♠콩순이', sysdate);
    /*
    제약조건
    - 테이블에 부적합한 자료가 입력되는 걸 막으려고 테이블을 생성할 때 각 컬럼을 정의하는 여러가지 규칙
    1) not null
    2) unique
    3) primary key: unique+not null
    4) check
    */
    
    /*
      1)not null 제약조건
    - null 값이 입력되지않게 하는 제약조건
    - 특정 열에 데이터의 중복 여부와는 상관없이 null 값을
      허용하지 않는 제약 조건
    */
    create table null_test(
    col1 varchar2(10) not null,
    col2 varchar2(10) not null,
    col3 varchar2(10) 
    );
    insert into null_test values('aa', 'aa1', 'aa2');
    insert into null_test(col1, col2) values('bb', 'bb1'); --error 발생(col3 not null 제약조건)
    insert into null_test(col1, col2) values('bb', ''); --error 발생(col3 not null 제약조건)
    
    /*
    2) unique 제약 조건
    - 열에 저장할 데이터의 중복을 허용하지 않고자 할 때
      사용하는 제약 조건.
    - null값을 허용함.
    */
    create table unique_test(
    col1 varchar2(10) unique,
    col2 varchar2(10) unique,
    col3 varchar2(10) not null,
    col4 varchar2(10) not null
    );
    insert into unique_test values('aa', 'aa1', 'aa2', 'aaa1');
    insert into unique_test values('bb', 'aa1', 'bbb1', 'ss1'); --에러(중복 데이터 발생)
    
    /*
    3) primary key(not null+unique)
        - 테이블에 하나만 존재해야됨.
        - 보통은 주민번호나 emp 테이블의 empno 들이
          primary key의 대표적인 예.
    */
    /*
    4) foreign key 제약 조건 
        - 다른 데이블의 필드(컬럼)을 참조해서 무결성을 검사하는 제약 조건.
        - 참조 키: 부모 테이블의 컬럼을 가리킴.
        - 외래 키: 자식 테이블의 컬럼을 가리킴.
        - 자식 테이블의 컬럼 값이 부모 테이블에 없을 때 무결성의 규칙에 어긋남.
        - 외래 키가 존재하려면 우선적으로 부모 테이블이 먼저 있어야됨.
        - 옵션)
        * on delete cascade
        ==> 부모 테이블 삭제 시 해당 데이터를 참조 중인 자식 테이블의 데이터까지 모두 삭제하는 옵션
        * on delete set null
        ==> 부모 테이블의 데이터 삭제 시 해당 데이터를 참조 중인 자식 테이블의 컬럼에 있는 값을 null로 변경
    */
    create table foreign_test(
    bunho number primary key,
    irum varchar2(30) not null,
    job varchar2(100) not null,
    -- deptno number references dept(deptno), --컬럼상 외래 키 제약 조건
    dept number,
    constraint dept_fk foreign key(dept)
    references dept(deptno) --테이블 창에서 외래키 제약 조건
    on delete cascade
    );

    insert into foreign_test values(1111, '홍길동', '영업사원', 30);
    insert into foreign_test values(3333, '안중근', '관리사원', 30);
    insert into foreign_test values(3333, '이순신', 'IT사원', 50); --에러 발생(부모가 없음)
    
    -- dept 테이블에서 10번 부서 삭제 ㄱ
    delete from dept_test where deptno = 10;
    
    create table dept_test(
    deptno member,
    dname varchar(100),
    loc varchar2(100),
    primary key(deptno)
    );
    insert into dept_test values(10, 'accounting', 'new york');
    insert into dept_test values(20, 'research', 'dallas');
    insert into dept_test values(30, 'sales', 'chicago');
    insert into dept_test values(40, 'operations', 'boston');
    
    /*
    5)check 제약 조건
    - 열에 저장 가능한 값의 범위 또는 패턴을 정의할 때
      사용되는 제약 조건.
    */
    create table check_test(
    gender varchar(6),
    constraint gender_chk check(gender in('남', '여'))
    
    );
    insert into check_test values('남');
    insert into check_test values('여');
    insert into check_test values('남자'); --에러(범위값 밖)
    
    
    /*
        join - on 키워드
        - 테이블과 테이블을 연결해 특정한 데이터를 얻고자 할 때 씀.
        - 두 개 이상의 테이블에 정보가 나눠져있을 때 씀.
        - 중복해서 데이터가 저장되는 것을 방지하기 위해 테이블을 나눠놓은 것.
        - 두 개 테이블로 나눠진 경우에는 데이터의 중복은 발생하지 않지만
          원하는 정보를 얻으려면 여러번 질의를 해야 하는 불편함이 발생함.
        - 특정 사원이 소속된 부서의 부서명을 알고싶을 땐 emp 테이블과
          dept 테이블을 넘나드는 작업이 생기므로 상당히 불편함. 그래서 두 개의
          테이블을 결합해서 원하는 결과를 얻어낼 수 있게하는 조인이라는 기능이 생김.
          
        조인의 종류
        1) Cross Join
        2) Equi Join
        3) Self Join
        4) Outer Join    
    */
    /*
    1) cross join
    - 두 개 이상의 테이블이 조인될 때 조건 없이 테이블 결합이
      이루어지는 조인. 테이블 상호간에 연결될 수 있는 모든 경우의 수를 산출해 나타내는
      조인 방법임. 그래서 테이블 전체 행의 칼럼이 조인 됨. 현재는 사용안하는 종류임. 
    */
    select * from emp, dept;
    
    /*
        2) Equi join
        - 가장 많이 사용되는 조인 방법.
        - 조인 대상이 되는 두 테이블에서 공통적으로 존재하는 칼럼의 값이
          일치하는 행을 연결해 결과를 생성하는 방법.
        - 두 테이블이 조인하려면 일치되는 공통 컬럼을 써야됨.
    */
    -- emp 테이블에서 사원의 사번, 이름, 담당업무, 부서번호 및
    -- 부서명, 부서위치를 화면에 ㄱ
    -- ==> emp 테이블과 dept 테이블을 조인시켜줘야 함.
    select empno, ename, job, e.deptno, dname, loc from emp e join dept d
    on e.deptno = d.deptno;
    
    --emp 테이블에서 사원명이 'SCOTT' 사원의 부서명을 알고싶으면?
    select ename, e.deptno, dname from emp e join dept d
    on e.deptno = d.deptno
    where ename = 'SCOTT';
    
    --문제) 부서명이 'RESEARCH'인 사원의 사번이름급여부서명근무위치를 화면에 ㄱ
    select empno, ename, sal, dname, loc, e.deptno from emp e join dept d
    on e.deptno = d.deptno
    where dname = 'RESEARCH';
    
    --문제) emp테이블에서 'NEW YORK'에 근무하는 사원의 이름과 급여 부서번호를 화면에 ㄱ
    select ename, sal, e.deptno, loc from emp e join dept d on e.deptno = d.deptno
    where loc = 'NEW YORK';
    
    --문제) emp 테이블에서 담당업무가 'SALESMAN'인 사원의 이름과 담당업무, 부서번호, 부서명, 근무위치
    -- 를 화면에 ㄱ
    select job, e.deptno, dname, loc from emp e join dept d 
    on e.deptno = d.deptno --테이블간 공통된 컬럼 => deptno <- 이게 있어야 조인 가능
    where job = 'SALESMAN';
    
    /*
    Self join
    - 하나의 테이블 내에서 조인을 해야 데이터를 얻어낼 수 있는데 말 그대로
      자기 자신과 조인을 하는 걸 말함(자웅동체)
    - from 절 다음에 테이블 이름이 나란히 두 번 기술 못함.
      따라서 같은 테이블이 하나 더 존재하는 것처럼 쓸 수 있게 
      테이블에 별칭을 붙여서 써야함.
    */
    -- emp 테이블에서 각 사원별 관리자의 이름을 화면에 ㄱ
    -- 예) CLERK 관리자 이름은 KING입니다.
    select e1.ename || '의 관리자 이름은' || e2.ename || '입니다' 
    from emp e1 join emp e2 
    on e1.mgr = e2.empno;
    
    -- emp 테이블에서 매니저가 'KING'인 사원들의 이름과 담당업무를 화면에 ㄱ
    select e1.ename, e1.job from emp e1 join emp e2 
    on e1.mgr = e2.empno where e2.ename = 'KING';
    
    /*
        outer join 
            -2개 이상의 테이블이 조인될 때 어느 한 쪽 테이블에는 해당되는 데이터가
            다른쪽 테이블에는 데이터가 존재하지 않는 경우 그 데이터가 출력안되는 문제점을
            해결하기 위해 사용되는 조인 기법.
            - 정보가 부족한 테이블의 컬럼 뒤에 '(+)' 기호를 붙여 씀.
    */
    
    select ename, e.deptno, dname from emp e join dept d on e.deptno(+) = d.deptno;
    
    select e1.ename, e1.job, e1.mgr from emp e1 join emp e2 on e1.mgr = e2.empno(+);
    -- ↑ 같은 테이블에 같은 테이블로 조인할 때는 앞에 별칭은 select 뒤 컬럼마다 붙여줘야됨
    
    /*
        dual 테이블
        - 오라클에서 자체적으로 제공해주는 테이블
        - 간단하게 함수를 이용 및 계산 결과값 확인할 때 쓰는 테이블
        - 오직 한 행, 한 컬럼만을 담고잇는 테이블.
        - 사용 용도: 특정 테이블을 생성할 필요 없이 함수 또는
                    계산을 하고자 할 때 사용이 됨.
                    
    */
    
    --오라클에서 제공해주는 함수들
        -- 1. 날짜 관련
        -- 1) sysdate: 현재 시스템 날짜를 구해오는 키워드.
        select sysdate from dual;
        -- 2) add months(현재 날짜, 숫자(개월수))
        select add_months(sysdate, 3) from dual;
        -- 3) next_day(현재 날짜, 요일) ==> 다가올 날짜(요일)을 구해주는 함수.
        select next_day(sysdate, '월') from dual;
        -- 4) to_char(날짜, '날짜형식') ==> 형식에 맞게 문자열로 날짜를 출력해주는 함수.
        select to_char(sysdate, 'yyyy/mm/dd') from dual;
        select to_char(sysdate, 'yyyy-mm-dd') from dual;
        -- 5) months_between('마지막날짜', 현재날짜) => 두 날짜 사이 개월 수 출력 함수.
        select months_between('24/07/31', sysdate) from dual;
        -- 6) last_day()
        --> 주어진 날짜가 속한 날의 마지막 날짜를 반환하는 함수.
        select last_day(sysdate) from dual;
        
        
        --2. 문자 관련
        -- 1-1) concat('문자열', '문자열2')
        --> 두 문자열을 연결해주는 함수.
        select concat('임성현', '게이') as fact from dual;
        -- 1-2) || 연산자: 문자열 연결 연산자.
        select '소환사의' || '협곡' as "롤하고싶다" from dual;
        -- 2) upper() : 소문자를 대문자로 바꾸는 함수.
        select upper('uppercut') from dual;
        -- 3) lower(): 대문자를 소문자로 바꾸는 함수.
        select lower('LOWBLOW') from dual;
        -- 4) substr('문자열', x, y): 문자열을 x부터 y 길이만큼 추출해주는 함수.
        select substr('hecarim', 3, 4) from dual;
        --> 값이 음수인 경우는 오른쪽(뒤쪽)에서부터 시작됨.
        select substr('ABCDEFG', -3, 2) from dual;
        
        -- 5) 자릿수를 늘리는 함수
            -- 5-1) lpad('문자열', '전체자릿수' '늘어난자릿수에 들어갈 문자열');
        select lpad('ABCDEFG', 15, '*') from dual;
        select rpad('ABCDEFG', 15, '*') from dual;
        -- 6) 문자를 지워주는 함수
            -- 6-1) ltrim(): 왼쪽 문자를 지워줌
            select ltrim('ABCDEFG', 'A') from dual;
            -- 6-2) rtrim(): 오른쪽 문자를 지워줌
            select rtrim('ABCDEFG', 'A') from dual;
        -- 7) replace(): 문자열을 교체해주는 함수. 
            -- 형식) replace('원본문자열', '교체될문자열', '새로운문자열');
            select replace('ABCDEFG', 'CDEF', 'FUCK') from dual;
        
            -- [문제1] emp 테이블에서 결과가 아래와 같이 나오도록
            -- 화면에 보여주세요.
            -- 결과) 'SCOTT의 담당업무는 ANALYST 입니다.'
            -- 단, concat() 함수를 이용하세요.
            select concat(ename || '의 담당업무는 ' || job, ' 입니다') from emp;

            -- [문제2] emp 테이블에서 결과가 아래와 같이 나오도록
            -- 화면에 보여주세요.
            -- 결과) 'SCOTT의 연봉은 36000입니다.'
            -- 단, concat() 함수를 이용하세요.
            select concat(ename || '의 연봉은' || sal*12, '입니다') from emp;

            -- [문제3] member 테이블에서 결과가 아래와 같이 나오도록
            -- 화면에 보여주세요.
            -- 결과) '홍길동 회원의 직업은 학생입니다.'
            -- 단, concat() 함수를 이용하세요.
            select concat(memname || ' 회원의 ' || ' 직업은 ' || job ,'입니다') 
            from member;
            
            
            
            -- [문제4] emp 테이블에서 사번, 이름, 담당업무를 화면에
            -- 보여주세요. 단, 담당업무는 소문자로 변경하여 보여주세요.
            select empno, ename, lower(job) as job from emp;  
            
            -- [문제5] 여러분의 주민등록 번호 중에서 생년월일을 추출하여
            -- 화면에 보여주세요.
            select substr('971217-1059412', 0, 6) from dual;
            
            -- [문제6] emp 테이블에서 담당업무에 'A' 라는 글자를
            -- '$'로 바꾸어 화면에 보여주세요.
            select replace(job, 'A', '$') as altered from emp;
            
            -- [문제7] member 테이블에서 직업이 '학생' 인 정보를
            -- '대학생'으로 바꾸어 화면에 보여주세요.
            select replace(job, '학생', '대학생') as altered from member;
            
            --[문제8] member 테이블에서 주소에 '서울시' 로 된 정보를
            -- '서울특별시'로 바꾸어 화면에 보여주세요.
            select replace(addr, '서울시', '서울특별시') as detailed from member;
            
        --3. 숫자 관련
        -- 1) abc(정수): 절댓값을 구해주는 함수.
        select abs(-23) from dual;
        -- 2) sign(정수): 양수(1), 음수(-1), 0을 반환해주는 함수.
        select sign(-15) from dual;
        select sign(-13), sign(0) from dual;
        
        -- 3) round(상수): 반올림 함수
        select round(1234.5555) from dual;
        -- 반올림 시 자릿수 지정(숫자(필수)), 반올림위치(선택))
        --> 음수 값을 지정하면 자연수 쪽으로 한자리씩 위로 반올림 해줌
        select round(0.1234574, 6) from dual;
        
        select round(3.342357, 5) from dual;
        select round(1256.5678, -2) from dual;
        
        -- 4) trunc(): 소수점 이하 자릿수를 잘라내는 함수.
            --형식) trunc(숫자(필수), 버릴위치(선택));
        select trunc(1234.1234567, 0) from dual;
        select trunc(1234.1234567, 4) from dual;
        select trunc(1234.1234567, -3) from dual;
        
        -- 5) ceil(): 무조건 올림 함수.
        select ceil(22.1) from dual;
        -- 6) power():제곱함수.
        select power(2, 4) from dual;
        -- 7) mod(): 나머지 함수.
        -- 형식) mod((나눗셈될 숫자), (나눌 숫자));
        select mod(77, 4) from dual;
        -- sprt(): 제곱근을 구해주는 함수
        select sqrt(3) from dual;
        /*
            ★★★★★★★★★★★★
            서브쿼리
            - 하나의 쿼리문 안에 포함된 또 하나의 쿼리문을 가리킴.
            - 쿼리문 안에 또 다른 쿼리문이 있는 걸 말함.
            - 서브쿼리는 메인쿼리가 서브쿼리를 포함하는 종속적인 관계임.
            - 여러 번 쿼리를 실행해서 얻을수 있는 결과를 하나의 중첩된
              쿼리 문장으로 결과를 얻을 수 있게됨.
            ** 주의사항
                - 서브쿼리는 괄호로 묶어서 쓰는 것이 관례임.
                - 서브쿼리 안에서는 order by 절은 못씀.
            
            - 실행방법: 우선 안쪽에 쿼리문 실행 후, 그 결과값을 갖고 바깥쪽 쿼리문 실행.
            
        */
        -- emp 테이블에서 이름이 'SCOTT'인 사원의 급여보다 더 많은 급여를 받는 사원의 사번,
        -- 이름,업무,급여를 화면에 보여주세요.
        select empno, ename, job, sal from emp 
        where sal > (select sal from emp where ename = 'SCOTT');
        
        select * from emp;
        
        -- [문제1] emp 테이블에서 평균급여보다 더 적게 받는 사원의
        -- 사번, 이름, 담당업무, 급여, 부서번호를 화면에 보여주세요.
        select empno, ename, job, deptno 
        from emp where sal < (select avg(sal) from emp);

-- [문제2] emp 테이블에서 사번이 7521인 사원과 담당업무가 같고,
-- 사번이 7934인 사원의 급여보다 더 많이 받는 사원의 사번, 이름, 
-- 담당업무, 급여를 화면에 보여주세요.
        select empno, ename, job, sal from emp 
        where job =(select job from emp where empno='7521') 
        and sal > (select sal from emp where empno = '7934');
        -- 메인쿼리 WHERE (서브쿼리1) AND (서브쿼리2)

-- [문제3] emp 테이블에서 담당업무가 'MANAGER' 인 사원의 최소급여보다
-- 적으면서, 담당업무가 'CLERK'은 아닌 사원의 사번, 이름, 담당업무,
-- 급여를 화면에 보여주세요.
        select empno, ename, job, sal from emp 
        where sal <(select min(sal) from emp where job = 'MANAGER')
        and job not in('CLERK');

-- [문제4] 부서위치가 'DALLAS' 인 사원의 사번, 이름, 부서번호, 
-- 담당업무를 화면에 보여주세요.
        select empno, ename, e.deptno, job from emp e join dept d
        on e.deptno = d.deptno
        where loc = 'DALLAS';
        

-- [문제5] member 테이블에 있는 고객의 정보 중 마일리지가 가장 높은
-- 고객의 모든 정보를 화면에 보여주세요.
        select *
        from member
        where mileage = (select max(mileage) from member); --최대 마일리지
        


-- [문제6] emp 테이블에서 이름이 'SMITH' 인 사원보다 더 많은 급여를
-- 받는 사원의 이름과, 급여를 화면에 보여주세요.
        select ename, sal from emp where sal > (select sal from emp where ename= 'SMITH');
        

-- [문제7] emp 테이블에서 10번 부서 급여의 평균 급여보다 적은 급여를 받는
-- 사원들의 이름, 급여, 부서번호를 화면에 보여주세요.
        select ename, sal, deptno from emp where sal 
        < (select avg(sal) from emp where deptno='10'); 
        

-- [문제8] emp 테이블에서 'BLAKE'와 같은 부서에 있는 사원들의
-- 이름과 입사일자, 부서번호를 화면에 보여주되, 'BLAKE' 는 제외하고
-- 화면에 보여주세요.
        --select ename, hiredate, deptno from emp where 
        --(select ename from emp where deptno = '30') and (select ename from emp where not in('BLAKE'));
        SELECT ename, hiredate, deptno FROM emp 
        WHERE deptno = '30' AND ename != 'BLAKE';


-- [문제9] emp 테이블에서 평균급여보다 더 많이 받는 사원들의 사번,
-- 이름, 급여를 화면에 보여주되, 급여가 높은데서 낮은 순으로 화면에 
-- 보여주세요.
        select empno, ename, sal
        from emp
        where sal > (select avg(sal) from emp)
        order by sal desc;
        

-- [문제10] emp 테이블에서 이름에 'T'를 포함하고 있는 사원들과 같은 부서에
-- 근무하고 있는 사원의 사번과 이름, 부서번호를 화면에 보여주세요.
        select empno, ename, deptno 
        from emp
        where deptno in(select distinct deptno from emp where ename like '%T%');


-- [문제11] 'SALES' 부서에서 근무하고 있는 사원들의 부서번호,
-- 이름, 담당업무를 화면에 보여주세요.
     select deptno, ename, job from emp
     where deptno =  (select deptno from dept where dname = 'SALES'); 

-- [문제12] emp 테이블에서 'KING'에게 보고하는 모든 사원의
-- 이름과 급여, 관리자를 화면에 보여주세요.
    select ename, sal, mgr
    from emp
    where mgr = (select empno from emp where ename = 'KING');

-- [문제13] emp 테이블에서 자신의 급여가 평균급여보다 많고, 이름에
-- 'S' 자가 들어가는 사원과 동일한 부서에서 근무하는 모든 사원의 
-- 사번, 이름, 급여, 부서번호를 화면에 보여주세요.
    select empno, ename, sal, deptno
    from emp
    where sal > (select avg(sal) from emp)
    and
    deptno in(select distinct deptno from emp where ename like '%S%');

-- [문제14] emp 테이블에서 보너스를 받는 사원과 부서번호, 급여가 같은
-- 사원의 이름, 급여, 부서번호를 화면에 보여주세요.
    select ename, sal, deptno
    from emp
    where deptno in(select deptno from emp where comm >0) --30번 부서
    and 
    sal in(select sal from emp where comm >0);


-- [문제15] products 테이블에서 상품의 판매가격이 판매가격의
-- 평균보다 큰 상품의 전체 내용을 화면에 보여주세요.
    select *
    from products
    where output_price > (select avg(output_price) from products);
    
---------------------------------

-- [문제16] products 테이블에 있는 판매 가격에서 평균 가격 이상의
-- 상품 목록을 구하되, 평균을 구할 때 가격이 가장 큰 금액인 상품을
-- 제외하고 평균을 구하여 화면에 보여주세요.
    select * 
    from products
    where output_price >=
    (select avg(output_price) from products
    where output_price != 
    (select max(output_price) from products));
-- [문제17] products 테이블에서 상품명의 이름에 '에어컨' 이라는
-- 단어가 포함된 카테고리에 속하는 상품목록을 화면에 보여주세요.
    select *
    from products 
    where category_fk in
    (select category_fk from products where products_name like '%에어컨%'); 

-- [문제18] member 테이블에 있는 고객 정보 중 마일리지가 가장 높은 
-- 금액을 가지는 고객에게 보너스 마일리지 5000점을 더 주어 고객명,
-- 마일리지, 마일리지+5000 점을 화면에 보여주세요.
    -- select mamname, mileage, mileage +5000
    -- from member 
    -- where mileage = (select max(mileage) from member);
    
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
    from products group by category_fk having count(*) >= 2;
    
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
    
    
