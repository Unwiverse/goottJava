-- 치피치피 차파차파 두비두비 다바다바(-- 는 주석 표시)

/*
    관계형 데이터베이스의 구성 요소
    1. 테이블
    - 관계형 데이터베이스는 기본적으로 데이터를 2차원 형태의
      표본 저장하고 관리함
    - 이러한 표 형태의 데이터 저장 공간을 테이블(table)이라고 함.
    - 테이블은 2차원 형태이므로 가로줄과 세로줄로 구성돼있음.
        * 가로줄: 행(row)
        * 세로줄: 열(column)
    2. 행
        -행은 저장하려는 하나의 객체를 구성하는 값
        - 예를 들어 학생 한 사람에 대한 정보를 저장한 것.
    3. 열
        - 저장하는 데이터를 대표하는 이름과 공통 특성을 정의한 것.
        - 열은 저장 정보의 종류(자료형)와 자료형의 저장 가능한 최대 
          크기, 중복 여부를 설정하게 됨.
*/

/*  
    오라클에서 속성에 들어가는 주요 자료형(data type)
    1. number(n, n1) : 숫자 자료형(정수, 실수)
        *n: 전체 자릿수
        *n1: 소숫점 자릿수
        *n - n1: 정수 자릿수
    예) number(7, 2): 전체 자릿수는 7자리고, 정수는 5자리, 소수점은 2자리
    
    2. char(n): 문자 n개가 저장되는 자료형 => 고정 자료형
    3. varchar(n): 문자열 n개가 저장되는 자료형 => 고정 자료형
    4. varchar2(n): 문자열 n개가 저장되는 자료형 => 기변 자료형
                    *한글은 무조건 2바이트씩 사용함
    5. date: 날짜가 저장되는 자료형 => 시스템의 현재 날짜 및 시간이 저장됨.
*/

/* 
    무결성(Integrity): 데이터베이스에 저장된 값과 그게 표현하는 현실 세계의 실제값이 일치
    하는 정확성
    
    무결성 제약조건: DB에 저장된 데이터의 정확성을 보장하기 위해서 정확하지 않은 데이터가
    DB 내에 저장되는 걸 방지하기 위한 조건.
    
    DB 내에서 사용되는 무결성 제약조건의 종류
    1.unique 제약조건:
    중복되면 안되는 제약 조건.
    2. not null: 공백 허용 x 제약조건.
    3. check 제약 조건: 특정 값이 아닌 데이터가 못들어오게 하는 제약 조건.
    4. 기본키(primary key) 제약 조건:
    unique + not null 제약 조건. 기본키는 해당 테이블을 대표하는 열로써 역할을 수행하며
    다른 테이블에서 외래키들이 참조할 수 있는 키로써 자격을 가짐.
    5. 외래키 제약 조건: 외래키는 다른 테이블의 기본키를 참조하는 컬럼의 집함임.
    여기서의 외래키 값은 참조 중인 테이블의 기본 키에 없는 내용을 참조 못함.
    이를 참조 무결점이라함.
*/
    
/*
    학생 테이블 만들기
    구성 요소(컬럼 - 속성)
    => 학번, 이름, 학과, 연락처, 주소
    테이블 만드는 형식) 
            create table 테이블이름(
            학번 자료형(크기) [제약조건], 제약조건은 생략 가능(생략하면 제약조건 x)
            이름 자료형(크기) [제약조건],
            학과 자료형(크기) [제약조건],
            연락처 자료형(크기) [제약조건],
            주소 자료형(크기) [제약조건]
            );
            
*/

create table student(
    hakbun varchar2(10) primary key,
    name varchar2(30) not null,
    major varchar2(40),
    phone varchar2(30) not null,
    addr varchar2(200), 
    status varchar(1),
    graduate date not null,
    constraint status_chk check(status in('y', 'n'))
    );
    
    --student 테이블에(학생 정보)를 추가해보자.
    --형식1)
    -- ==> insert into 테이블이름 values(열 1 데이터, 열 2 데이터.........);
    insert into student values('2024_001', '홍길동', '경제학과', '01050028033',
    '서울시 시흥구', 'y', sysdate);
    
    insert into student values('16101_586', '엄승현', '정보학과', '01050028033',
    '구로구 궁동', 'n', sysdate);
    
    --형식2)
    -- ==> insert into 테이블이름(not null 제약조건 열 이름을 기재)
    --           values() 
    
    insert into student(hakbun, name, phone, graduate)
            values('2024_002', '한성환', '01065290721', sysdate);
        
    insert into student 
    values('17824578', '유관순', '회계학과', '01024442444', '충남 성환시', 'y', sysdate);
            
       
    
    create table SALGRADE(
    GRADE number(3, 0) primary key,
    LOSAL number(8, 0) not null,
    HISAL number(8, 0) not null
    );
    insert into SALGRADE values(100, 1000,2000);
    
    --만약 테이블에 열을 추가해야 되면
    -- 형식) alter table 테이블이름 add(추가할 열 이름) 자료형(크기) [제약조건];
    alter table student add(age number); -- 제약조건 주의해서 넣기
    
    --테이블의 컬럼을 수정해야되는 경우(컬럼의 전체적인 내용 수정)
    --형식) alter table 테이블이름 modify(컬럼명 자료형(크기));
    alter table student modify(age varchar2(3));
    
    --테이블의 열 이름을 바꿔야할 때
    -- 형식) alter table 테이블이름 rename column 기존컬럼명 to 바꿀컬럼명
    alter table student rename column name to irum;
    
    -- 테이블의 컬럼을 삭제해야될 때
    -- 형식) alter table 테이블이름 drop column 컬럼명;
    alter table student drop column age;
    
    /*
    1. DDL(Data Define Language: 데이터 정의 언어)
        - CREATE: 데이터 베이스 또는 테이블을 생성하는 명령어.
        - ALTER: 테이블을 수정하는 명령어.
        - DROP: 데이터베이스 or 테이블을 삭제하는 명령어.
        - TRUNCATE: 테이블을 초기화하는 명령어.
    
    2. DML(Data Manipulation language: 데이터 조작 언어)
        => DB에서 가장 많이 쓰는 명령어.
        - SELECT: 데이터 검색 명령어.
        - INSERT: 데이터 추가 명령어.
        - UPDATE: 데이터 수정 명령어.
        - DELETE: 데이터 삭제 명령어.
        
    3. DCL(Data Control Language: 데이터 제어 언어)
        - GRANT: 특정 데이터베이스 사용자에게 작업의 특정 수행 권한을 부여하는 명령어.
        - REMOVE: 특정 데이터베이스 사용자에게 작업의 특정 수행 권한을 삭제하는 명령어.
        - COMMIT:트랜젝션 작업을 완료하는 명령어.
        - ROLLBACK: 트랜젝션 작업을 취소하거나 이전 상태로 되돌리는 명령어.
    */
    
    --데이터를 수정하는 방법
    --형식) Update 테이블 이름 set 수정할 컬럼명 = 값, 수정할 컬럼명 = 값
    --      where 기본키컬럼명 = 값;
    update student set major = '국문학과', addr = '서울시 중구'
        where hakbun = '2024_002';
    update student set status = 'n'
        where hakbun = '2024_002';
    
    --테이블에서 데이터 삭제하는 방법
    -- 형식) delete from 테이블이름 where 기본키컬럼명 = 값;
    delete from student where hakbun = '2024_001';
    -- delete from student; -- > 테이블 전체 삭제
    
    -- commit; --transaction 완료 명령어 
    -- rollback; --이전 상태로 되돌리기 명령어
    
    -- 데이터를 검색하는 명령어.
    -- student 테이블에 있는 모든 데이타를 화면에 보여주세요.
    -- 형식) select * from 테이블이름
    select * from student; -- *는 전부 다라는 뜻
    
    -- 특정 열만 보이도록 할 때
    -- 형식) select 컬럼명1, 컬럼명2, 컬럼명3... from 테이블명
    select irum, phone from student;
    
    --문제) emp 테이블에서 empno, job, deptho 컬럼을 화면에 보여봐라
    select empno, job, deptno from emp;
    
    --문제2) emp테이블에서 이름, 입사일, 급여를 화면에 보여주시요.
    select ename, hiredate, sal from emp;
    --문제3) emp 테이블에서 사번, 이름, 담당업무, 보너스를 화면에 ㄱ
    select empno, ename, job, comm from emp;
    --문제4) emp 테이블에서 사번, 이름, 급여, 보너스, 급여+보너스  결과를 화면에 보여주세요.
    select empno, ename, sal, comm, sal+comm from emp; 
    
    -- null값을 가지는 column은 다른 컬럼과 연산을 하면 전부 null로 처리되는 문제가있다.
    
    --nvl() 함수: null 값을 특정한 값으로 변경시켜주는 함수.
    --             모든 자료형에 적용가능.
    --             nvl 함수를 쓸 땐 전환되는 값의 
    --             자료형을 일치시켜줘야함
    --형식) nvl(null값이 들어가있는 열 이름, 바꿀 값)
    select empno, ename, sal, comm, sal+nvl(comm, 0) from emp;
    
    -- nvl2() 함수: 자바에서의 3항연산자와 비슷한 함수.
    -- 형식) nvl2(열 이름, expr1, expr2)
    -- ==> 컬럼에 들어있는 값이 null이 아니면 expr1 값을 반환
    -- ==> 컬럼에 들어있는 값이 null이면 expr2 값을 반환
    select empno, ename, sal, comm, sal+nvl2(comm, comm, 0) from emp;
    
    --as 키워드: 컬럼의 제목(title)의 이름을 변경시키는 키워드
    --          별칭 또는 별명이라고 함.
    --          사용 시엔 열 이름 바로 뒤에 씀
    --          열 이름과 별칭 사이에 as라는 키워드를 넣어주면 된다.
    --          보통 별칭은 ""(쌍따옴표) 안에 작성한다. 
    --          생략 가능함
    select empno, ename, sal, comm, sal+nvl2(comm, comm, 0) as total from emp;
    
    --문제) emp 테이블에서 사번, 이름, 급여, 급여 10% 인상액을 화면에 ㄱ
    select empno, ename, sal, sal+(sal/10) as withcomm from emp;
    
    --emp 테이블에서 각 사원의 담당업무를 화면에 ㄱ
    select job from emp;
    
    --emp 테이블에서 각 사원의 관리자를 화면에 보여주세요
    select mgr from emp; 
    /*
    distinct 키워드: 중복 제거 키워드 
    - 주로 하나의 컬럼에서 중복된 값을 제거하고 보여줄 때 씀
    - distinct 키워드는 항상 select 키워드 다음에 기술한다.
    - distinct 키워드 뒤에 나오는 열들은 모두 distinct의 영향을 받는다.
    - distinct 키워드 뒤에 여러 개의 컬럼이 기술이 되면 해당 컬럼들은 중복이 안되게
    나타난다.
    */
    -- emp 테이블에서 각 사원의 담당업무를 중복안되게 화면에 ㄱ
    select distinct job from emp;
    -- emp 테이블에서 각 사원의 매니저를 중복안되게 화면에 ㄱ
    select distinct mgr from emp;
    
    --문제) emp 테이블에서 담당업무와 관리자, 부서번호를 화면에 ㄱ
    select distinct job, mgr, deptno from emp;
    
    DESC EMP;
    
    
    
    
    
    
    
    