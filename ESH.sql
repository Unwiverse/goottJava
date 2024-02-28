--member��� ���̺��� ������

create table member(
    memno number primary key, --ȸ����ȣ
    memid varchar2(20) not null, --ȸ�� ���̵�
    memname varchar(30) not null, --ȸ�� �̸�
    mempwd varchar(20) not null, --ȸ�� ���
    age number,                     --ȸ�� ����
    mileage number,                 --ȸ�� ���ϸ���
    job varchar2(30)            --ȸ�� ����
    );
    --member ���̺� ȸ�� ������ �����غ���.
    insert into member 
        values(1, 'id1', '�����', '1234', 54, 0, '�л�');
    insert into member 
        values(2, 'id2', '�߹̾�', '4312', 81, 17, '������');
    insert into member 
        values(3, 'id3', '�Ż��', '3123', 54, 55, '���л�');
    insert into member 
        values(4, 'id4', '�ڰ���', '7782', 28, 0, '���׳�');
    insert into member 
        values(5, 'id5', '������', '0521', 14, 1721, '������');
    insert into member 
        values(6, 'id6', '�ֿ�����', '0528', 35, 88, 'MMA����');
    insert into member 
        values(7, 'id7', '������', '3391', 26, 0, '���');
    
  -- ī�װ� ���̺��� ����� ����.
create table category(
    cnum number unique,                        -- ī�װ� ��ȣ
    category_code varchar2(8),                 -- ī�װ� �ڵ�
    category_name varchar2(30) not null,       -- ī�װ� �̸�
    primary key(category_code)
);

-- ī�װ� ���̺� �����͸� ������ ����.
insert into category values(1, '00010000', '������ǰ');
insert into category values(2, '00010001', 'TV');
insert into category values(3, '00010002', '��ǻ��');
insert into category values(4, '00010003', '��Ʈ��');
insert into category values(5, '00010004', '������');
insert into category values(6, '00020000', '�Ƿ���ǰ');
insert into category values(7, '00020001', '����');
insert into category values(8, '00020002', '�ӿ�');
insert into category values(9, '00020003', '����');
insert into category values(10, '00030000', '����');
insert into category values(11, '00030001', '��ǻ�͵���');
insert into category values(12, '00030002', '�Ҽ�');

-- ��ǰ ���� ���̺��� ����� ����.
create table products(
    pnum number(11) primary key,                   -- ��ǰ ��ȣ
    category_fk varchar2(8) not null,              -- ī�װ� �ڵ�
    products_name varchar2(50) not null,           -- ��ǰ��
    ep_code_fk varchar2(5) not null,               -- ��ǰ �ڵ�
    input_price number(10) default 0 not null,     -- ��ǰ �԰� ����
    output_price number(10) default 0 not null,    -- ��ǰ ��� ����
    trans_cost number(5) default 0 not null,       -- ��ǰ ��ۺ�
    mileage number(6) default 0 not null,          -- ��ǰ ���ϸ���
    company varchar2(30),                          -- ��ǰ ������
    constraint category_ref foreign key(category_fk) 
        references category(category_code)
);

-- ��ǰ �����͸� ������ ����.
insert into products
   values(1, '00010001', 'S ������ TV', '00001', 5000000, 8000000, 0, 100000, '�Ｚ');
insert into products
   values(2, '00010001', 'L TV', '00002', 1000000, 1500000, 0, 50000, 'LG');
insert into products
   values(3, '00010004', 'S ������', '00001', 1000000, 1100000, 5000, 100000, '�Ｚ');
insert into products
   values(4, '00010000', 'C ���', '00003', 200000, 220000, 5500, 0, '����');
insert into products
   values(5, '00010004', 'L ������', '00003', 1200000, 1300000, 0, 0, 'LG');
insert into products
   values(6, '00020001', '��������', '00002', 100000, 150000, 2500, 0, '');
insert into products
   values(7, '00020001', '��������', '00002', 120000, 200000, 0, 0, '');
insert into products
   values(8, '00020002', '�簢��Ƽ', '00002', 10000, 20000, 0, 0, '���𰡵�');
insert into products
   values(9, '00020003', '�ủ����', '00002', 15000, 18000, 0, 0, '');
insert into products
   values(10, '00030001', '������ �ø���', '00001', 25000, 30000, 2000, 0, '���');

-- ����: member ���̺��� ȸ�� �̸��� ����, ���� ��
    select memname, age, job from member;
-- ����: products ���̺��� ��ǰ��, �԰�, ���, �����縦 ȭ�鿡 ��
--    select product_name, input_price, output_price, company from products;
        
-- king ����� ������ 60000�Դϴ�.
-- ||: ����Ŭ���� ���� ������.
    select ename || '����� ������' || sal*12 || '�Դϴ�' as "������ ����" from emp;
    
    select memname || 'ȸ���� ������' || job || '�̰�, ���ϸ�����' || mileage || '�Դϴ�' from member;
    

    
    --���̺� ���� ���
    -- drop table ���̺�� purge; 
    
    /*
        �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
        where ������
        - ��� �����͸� ��ȸ�ϴ°� �ƴϰ� ����ڰ� ���ϴ�
        �����͸� ��ȸ�� �� �����.
        - where �������� �ڷḦ ���͸��� �� ���� Ű����.
        - where �������� from ���̺� �̸� �ڿ� ����ؾ���.
        ����) select �÷���1, 2, 3
            from ���̺��̸� where ���ǽ�;
        
        ���ǽĿ� ���� ����
        1) = : ������ ������ Ȯ��
        2) < : ������ ������ ���� Ȯ��
        3) <= : ������ �۰ų� ������ ���� Ȯ��
        4) > : ������ ū�� ���� Ȯ��
        5) >= : ������ ũ�ų� ������ Ȯ��
        6) !=, <> : ���� ���� ������ Ȯ��
        7) between A and B: A�� B ���̿� �ִ��� ���� Ȯ��.
        8) in(list): list �� �߿� ��� �ϳ��� ��ġ�ϴ��� ���� Ȯ��.
        9) not between A and B: A�� B ���̿� ������ Ȯ��.
        10) not in(list): list���� ��ġ ���ϴ��� Ȯ��.
    */
    --emp ���̺��� �������� 'manager'�� ����� ��� ������ ȭ�鿡 ��
    select * from emp where job = 'MANAGER';
    
    -- emp ���̺��� �������� 'SALESMAN'�� ����� ��������� ȭ�鿡 ��
    select * from emp where job = 'SALESMAN';
    
    --����) emp ���̺��� ���ʽ��� 300, 500, 1400�� ����� ��� ���� ȭ�鿡 ��
    select * from emp where COMM between 1 and 1400;
    
    select * from member where memname = '�����' and job = '�л�';
    /*
    ����) product ���̺��� �����簡 '�Ｚ' �Ǵ� '����' �̸鼭 �԰��� 100����
          ������ ��ǰ�� ��ǰ��� �԰�, ����� ȭ�鿡 ��
    */
    /*
    select product_name, input_price, output_price from products where company
    in ('�Ｚ', '����') and output <=1000000;
    */
    /*
    ����) emp ���̺��� �޿��� 1100 �̻� �������� MANAGER�� ����� ���, �̸�
          ������, �޿��� ȭ�鿡 ��
    */
    select empno, ename, job, sal from emp where sal >= 1100 and job ='MANAGER';
    
    /*
    �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
    like Ű����: �˻� Ű����
    1) where ename like '%S%' ==> ename Į���� s�ڸ� �����ϴ� ��� �̸� �˻�
    2) where ename like 'S%' ==> ename �÷��� s�ڷ� �����ϴ� ����� �̸��� �˻�.
    3) where ename like '%S' ==> ename �÷��� ������ ���ڰ� s�ڷ� ������ ��� �̸� �˻�
    4) where enmae like '_S%' ==> ename �÷��� �ι�° ���ڰ� s�ڸ� �����ϴ� ��� �̸� �˻�.
    */
    
    --emp ���̺��� ����� a��� ���ڸ� �����ϴ� ����� ��� ������ �����ּ���.
    select job from emp where ename like '%A%'; 
    --����) emp ���̺��� ����� 'M'�̶�� ���ڸ� �����ϴ� ����� ��� ������ ȭ�鿡 ��
    select * from emp where ename like '%M%';
    --����) emp ���̺��� ����� 'S'��� ���ڷ� ������ ����� ��� ������ ȭ�鿡 ��
    select * from emp where ename like '%S';
    --����) emp ���̺��� ������� �� ��° ���ڿ� 'I'��� ���ڸ� �����ϴ� ����� ��� ������ ȭ�鿡 ��
    select * from emp where ename like '_I%';
    --����) emp ���̺��� �Ի�⵵�� 82�⵵�� ����� ���, �̸�, ������, �Ի����ڸ� ȭ�鿡 ��
    select empno, ename, job, hiredate from emp where hiredate like '%82%';
    --����) member ���̺��� ����� '3'���� �����ϴ� ȸ���� �̸�, ����, ����� ȭ�鿡 ��
    select memname, age, mempwd from member where mempwd like '3%';
    
    select * from member where memname like '��%';
    
    /*
      �ڡ� �� �� �� �� �� �� �� �� �ڡڡڡ�  
      order by ��
      - �ڷḦ �����Ͽ� ��Ÿ�� �� ����ϴ� ��ɾ�.
      - order by ���� �� ���� select ������ �� �������� ��ġ�ؾ���.
      - acs: �������� ����
      - desc: �������� ����
      - �⺻������ order by ���� ��� �� �� �������� ������ default��.
      - �������� ������ ��쿣 asc�� ���� ����.
    */
    -- ��� ���̺��� �̸��� �������� �������� �����ؼ� ��� ������ ȭ�鿡 ��
    
    select * from member order by memname asc;
    -- ��, �̸��� ���� �� ���̸� �������� �������� ����.
    select * from member order by memname, age desc;
    
    --����) emp ���̺� �μ���ȣ�� �������� �������� �����ϰ� �μ���ȣ�� ���� ��
    --      �޿��� �������� �������� �����ؼ� ȭ�鿡 ��
    select * from emp order by deptno asc;
    select * from emp order by deptno, sal desc;
    
    --����) emp ���̺��� �޿��� 1100 �̻��� ������� ������ �����ֵ� �Ի����ڰ� ���� ������
    --      �����ؼ� ȭ�鿡 ��
    select * from emp where sal >= 1100 order by hiredate asc;
    
    --����) emp ���̺��� �μ���ȣ�� �������� �������� �����Ͽ� ��Ÿ����
    --      �μ���ȣ�� ������ �������� �������� ���������ؼ� ����. ���� ��������
    --      ������ �޿��� �������� ���� ������ �����Ͽ� ȭ�鿡 ��
    --select * from emp order by deptno, sal desc;
    select * from emp order by deptno, job asc, sal desc;
   
    /*
        not Ű����: ����. 
        - ������ ó���ϴ� ��쿣 �ϴ��� ���� ������ �ۼ� ��
          ���� �ǹ��� not ���̱�.
    
    */
    -- emp ���̺��� �������� manager, clerk, analyst�� �ƴ� ����� ���, �̸�, ������, �޿� ȭ�鿡 ��
    select empno, ename, job, sal from emp where job not in('MANAGER', 'ANALYST', 'CLERK');
    
    --����) emp ���̺��� �̸��� 'S'�ڰ� �鰡�� �ʴ� ��� �̸��� �������� ȭ�鿡 ��
    select ename, job from emp where ename not like '%S%';
    
    --����) emp ���̺��� �μ���ȣ�� 10�� �μ��� �ƴ� ����� �̸�, ������, �μ���ȣ�� ȭ�鿡 ��
    select ename, job, deptno from emp where deptno not in('10');
    
    --����) emp ���̺��� ���ʽ��� null�� �ƴ� ����� ��� ������ ȭ�鿡 ��
    select * from emp where comm not like '%null%';
    
    /*
    �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
    ����� ������ ����� ��
    - create user ����� ������ identify by ��й�ȣ
    - ������� ������ ���� ���� ������ ����.
    - grant connect, resource to ����ڰ�����;
    
    - role: ����ڿ��� ���� ȿ�������� ������ �ο��� �� �ְ� �������� ������ ������� �� ����.
    - connect role ==>  ����Ŭ�� ������ �� �ִ� ���� ���� �� ����ڰ� DB ������ �ǰ��ϱ� ���� 
                        ���� �⺻���� �ý��� ������ ������� �� ����.
    - resource role ==> ����ڰ� ���̺��� ������ �� �ְ��ϱ� ���ؼ� �ý��� ������ ������� �� ����.
                        ���� insert, update, delete ������ ����� �� �ִ� ������ ������� �� ����.
    
    */
    /*
    �׷��Լ� ==> ���� �� �Ǵ� ���̺� ��ü�� ���� �Լ��� ����Ǿ�
                �ϳ��� ������� �������� �Լ�.
    1) avg(): ��հ��� ���ϴ� �Լ�.
    2) count(): ��(���ڵ�)�� ������ ���ϴ� �Լ�.
                => null���� �����ϰ� ���� ������ ����.
    3) min(): �ּҰ� ���ϱ� �Լ�.
    4) max(): �ִ밪 ���ϱ�.
    5) sum(): �� �� ���ϱ�.
    */
    
    -- emp) ���̺��� ����� ���� �ִ� ��� ����� ���� ���ؼ� ȭ�鿡 ��
    select count(empno) as chang from emp;
    
    --����) emp ���̺��� ������(mgr)�� ���� ���ؼ� ȭ�鿡 ��
    select count(distinct mgr) as mgrnum from emp;
    
    --����) emp ���̺��� ��� salesman�� �޿� ��հ� �޿� �ְ��, ������, �հ���� ���ؼ�
    -- ȭ�鿡 ��
    select avg(sal), max(sal), min(sal), sum(sal) from emp where job = 'SALESMAN';
    
    /*
    ������(sequence) 
    ==> ������ �ο��� �� ����ϴ� ����.
        �������� ��ȣ�� ������ִ� ����� ��.
        
    ����)
        create sequence �������̸�
        start with n1���۹�ȣ ���� - default �� 1;
        increament n1(������ �ִ� ��ȣ ����)
        maxvalue n1(������ �ִ� ��ȣ ����)
        minvalue n1(������ �ּ� ��ȣ ����)
        cache/nocache(ĳ�� �޸� ��� ����, ���� ����)
        
        1) cache: �������� ������ �����ϱ� ���� �̸� ĳ�� �޸𸮿�
                  �������� �־�ξ� �غ��ϰ� �ִٰ� ������ �۾���
                  �ʿ��� �� �����.
                  default�δ� 20���� �������� ĳ�� �޸𸮿� �����ϰԵ�.
        2) nocache: cache ����� ���� �ʴ´ٴ� �ǹ�.
        
    */
    --memo��� ���̺�
    create table memo(
    bunho number, 
    title varchar2(100) not null,
    writer varchar2(30) not null,
    cont varchar(1000) not null,
    regdate date,
    primary key(bunho)
    );
    -- memo ���̺��� �̿� �� ����� ������
    create sequence memo_seq
    start with 1
    increment by 1
    cache 20; 
    
    -- memo ���̺��� ������ ����
    insert into memo values(memo_seq.nextval, '�޸�1', 'ȫ�浿', '��������', sysdate);
    insert into memo values(memo_seq.nextval, '�޸�2', '�̰���', '���ڼ���', sysdate);
    insert into memo values(memo_seq.nextval, '�޸�3', '�Ӽ���', '�������', sysdate);
    /*
    ��������
    - ���̺� �������� �ڷᰡ �ԷµǴ� �� �������� ���̺��� ������ �� �� �÷��� �����ϴ� �������� ��Ģ
    1) not null
    2) unique
    3) primary key: unique+not null
    4) check
    */
    
    /*
      1)not null ��������
    - null ���� �Էµ����ʰ� �ϴ� ��������
    - Ư�� ���� �������� �ߺ� ���οʹ� ������� null ����
      ������� �ʴ� ���� ����
    */
    create table null_test(
    col1 varchar2(10) not null,
    col2 varchar2(10) not null,
    col3 varchar2(10) 
    );
    insert into null_test values('aa', 'aa1', 'aa2');
    insert into null_test(col1, col2) values('bb', 'bb1'); --error �߻�(col3 not null ��������)
    insert into null_test(col1, col2) values('bb', ''); --error �߻�(col3 not null ��������)
    
    /*
    2) unique ���� ����
    - ���� ������ �������� �ߺ��� ������� �ʰ��� �� ��
      ����ϴ� ���� ����.
    - null���� �����.
    */
    create table unique_test(
    col1 varchar2(10) unique,
    col2 varchar2(10) unique,
    col3 varchar2(10) not null,
    col4 varchar2(10) not null
    );
    insert into unique_test values('aa', 'aa1', 'aa2', 'aaa1');
    insert into unique_test values('bb', 'aa1', 'bbb1', 'ss1'); --����(�ߺ� ������ �߻�)
    
    /*
    3) primary key(not null+unique)
        - ���̺� �ϳ��� �����ؾߵ�.
        - ������ �ֹι�ȣ�� emp ���̺��� empno ����
          primary key�� ��ǥ���� ��.
    */
    /*
    4) foreign key ���� ���� 
        - �ٸ� ���̺��� �ʵ�(�÷�)�� �����ؼ� ���Ἲ�� �˻��ϴ� ���� ����.
        - ���� Ű: �θ� ���̺��� �÷��� ����Ŵ.
        - �ܷ� Ű: �ڽ� ���̺��� �÷��� ����Ŵ.
        - �ڽ� ���̺��� �÷� ���� �θ� ���̺� ���� �� ���Ἲ�� ��Ģ�� ��߳�.
        - �ܷ� Ű�� �����Ϸ��� �켱������ �θ� ���̺��� ���� �־�ߵ�.
        - �ɼ�)
        * on delete cascade
        ==> �θ� ���̺� ���� �� �ش� �����͸� ���� ���� �ڽ� ���̺��� �����ͱ��� ��� �����ϴ� �ɼ�
        * on delete set null
        ==> �θ� ���̺��� ������ ���� �� �ش� �����͸� ���� ���� �ڽ� ���̺��� �÷��� �ִ� ���� null�� ����
    */
    create table foreign_test(
    bunho number primary key,
    irum varchar2(30) not null,
    job varchar2(100) not null,
    -- deptno number references dept(deptno), --�÷��� �ܷ� Ű ���� ����
    dept number,
    constraint dept_fk foreign key(dept)
    references dept(deptno) --���̺� â���� �ܷ�Ű ���� ����
    on delete cascade
    );

    insert into foreign_test values(1111, 'ȫ�浿', '�������', 30);
    insert into foreign_test values(3333, '���߱�', '�������', 30);
    insert into foreign_test values(3333, '�̼���', 'IT���', 50); --���� �߻�(�θ� ����)
    
    -- dept ���̺��� 10�� �μ� ���� ��
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
    5)check ���� ����
    - ���� ���� ������ ���� ���� �Ǵ� ������ ������ ��
      ���Ǵ� ���� ����.
    */
    create table check_test(
    gender varchar(6),
    constraint gender_chk check(gender in('��', '��'))
    
    );
    insert into check_test values('��');
    insert into check_test values('��');
    insert into check_test values('����'); --����(������ ��)
    
    
    /*
        join - on Ű����
        - ���̺�� ���̺��� ������ Ư���� �����͸� ����� �� �� ��.
        - �� �� �̻��� ���̺� ������ ���������� �� ��.
        - �ߺ��ؼ� �����Ͱ� ����Ǵ� ���� �����ϱ� ���� ���̺��� �������� ��.
        - �� �� ���̺�� ������ ��쿡�� �������� �ߺ��� �߻����� ������
          ���ϴ� ������ �������� ������ ���Ǹ� �ؾ� �ϴ� �������� �߻���.
        - Ư�� ����� �Ҽӵ� �μ��� �μ����� �˰���� �� emp ���̺��
          dept ���̺��� �ѳ���� �۾��� ����Ƿ� ����� ������. �׷��� �� ����
          ���̺��� �����ؼ� ���ϴ� ����� �� �� �ְ��ϴ� �����̶�� ����� ����.
          
        ������ ����
        1) Cross Join
        2) Equi Join
        3) Self Join
        4) Outer Join    
    */
    /*
    1) cross join
    - �� �� �̻��� ���̺��� ���ε� �� ���� ���� ���̺� ������
      �̷������ ����. ���̺� ��ȣ���� ����� �� �ִ� ��� ����� ���� ������ ��Ÿ����
      ���� �����. �׷��� ���̺� ��ü ���� Į���� ���� ��. ����� �����ϴ� ������. 
    */
    select * from emp, dept;
    
    /*
        2) Equi join
        - ���� ���� ���Ǵ� ���� ���.
        - ���� ����� �Ǵ� �� ���̺��� ���������� �����ϴ� Į���� ����
          ��ġ�ϴ� ���� ������ ����� �����ϴ� ���.
        - �� ���̺��� �����Ϸ��� ��ġ�Ǵ� ���� �÷��� ��ߵ�.
    */
    -- emp ���̺��� ����� ���, �̸�, ������, �μ���ȣ ��
    -- �μ���, �μ���ġ�� ȭ�鿡 ��
    -- ==> emp ���̺�� dept ���̺��� ���ν������ ��.
    select empno, ename, job, e.deptno, dname, loc from emp e join dept d
    on e.deptno = d.deptno;
    
    --emp ���̺��� ������� 'SCOTT' ����� �μ����� �˰������?
    select ename, e.deptno, dname from emp e join dept d
    on e.deptno = d.deptno
    where ename = 'SCOTT';
    
    --����) �μ����� 'RESEARCH'�� ����� ����̸��޿��μ���ٹ���ġ�� ȭ�鿡 ��
    select empno, ename, sal, dname, loc, e.deptno from emp e join dept d
    on e.deptno = d.deptno
    where dname = 'RESEARCH';
    
    --����) emp���̺��� 'NEW YORK'�� �ٹ��ϴ� ����� �̸��� �޿� �μ���ȣ�� ȭ�鿡 ��
    select ename, sal, e.deptno, loc from emp e join dept d on e.deptno = d.deptno
    where loc = 'NEW YORK';
    
    --����) emp ���̺��� �������� 'SALESMAN'�� ����� �̸��� ������, �μ���ȣ, �μ���, �ٹ���ġ
    -- �� ȭ�鿡 ��
    select job, e.deptno, dname, loc from emp e join dept d 
    on e.deptno = d.deptno --���̺� ����� �÷� => deptno <- �̰� �־�� ���� ����
    where job = 'SALESMAN';
    
    /*
    Self join
    - �ϳ��� ���̺� ������ ������ �ؾ� �����͸� �� �� �ִµ� �� �״��
      �ڱ� �ڽŰ� ������ �ϴ� �� ����(�ڿ���ü)
    - from �� ������ ���̺� �̸��� ������ �� �� ��� ����.
      ���� ���� ���̺��� �ϳ� �� �����ϴ� ��ó�� �� �� �ְ� 
      ���̺� ��Ī�� �ٿ��� �����.
    */
    -- emp ���̺��� �� ����� �������� �̸��� ȭ�鿡 ��
    -- ��) CLERK ������ �̸��� KING�Դϴ�.
    select e1.ename || '�� ������ �̸���' || e2.ename || '�Դϴ�' 
    from emp e1 join emp e2 
    on e1.mgr = e2.empno;
    
    -- emp ���̺��� �Ŵ����� 'KING'�� ������� �̸��� �������� ȭ�鿡 ��
    select e1.ename, e1.job from emp e1 join emp e2 
    on e1.mgr = e2.empno where e2.ename = 'KING';
    
    /*
        outer join 
            -2�� �̻��� ���̺��� ���ε� �� ��� �� �� ���̺��� �ش�Ǵ� �����Ͱ�
            �ٸ��� ���̺��� �����Ͱ� �������� �ʴ� ��� �� �����Ͱ� ��¾ȵǴ� ��������
            �ذ��ϱ� ���� ���Ǵ� ���� ���.
            - ������ ������ ���̺��� �÷� �ڿ� '(+)' ��ȣ�� �ٿ� ��.
    */
    
    select ename, e.deptno, dname from emp e join dept d on e.deptno(+) = d.deptno;
    
    select e1.ename, e1.job, e1.mgr from emp e1 join emp e2 on e1.mgr = e2.empno(+);
    -- �� ���� ���̺� ���� ���̺�� ������ ���� �տ� ��Ī�� select �� �÷����� �ٿ���ߵ�
    
    /*
        dual ���̺�
        - ����Ŭ���� ��ü������ �������ִ� ���̺�
        - �����ϰ� �Լ��� �̿� �� ��� ����� Ȯ���� �� ���� ���̺�
        - ���� �� ��, �� �÷����� ����մ� ���̺�.
        - ��� �뵵: Ư�� ���̺��� ������ �ʿ� ���� �Լ� �Ǵ�
                    ����� �ϰ��� �� �� ����� ��.
                    
    */
    
    --����Ŭ���� �������ִ� �Լ���
        -- 1. ��¥ ����
        -- 1) sysdate: ���� �ý��� ��¥�� ���ؿ��� Ű����.
        select sysdate from dual;
        -- 2) add months(���� ��¥, ����(������))
        select add_months(sysdate, 3) from dual;
        -- 3) next_day(���� ��¥, ����) ==> �ٰ��� ��¥(����)�� �����ִ� �Լ�.
        select next_day(sysdate, '��') from dual;
        -- 4) to_char(��¥, '��¥����') ==> ���Ŀ� �°� ���ڿ��� ��¥�� ������ִ� �Լ�.
        select to_char(sysdate, 'yyyy/mm/dd') from dual;
        select to_char(sysdate, 'yyyy-mm-dd') from dual;
        -- 5) months_between('��������¥', ���糯¥) => �� ��¥ ���� ���� �� ��� �Լ�.
        select months_between('24/07/31', sysdate) from dual;
        -- 6) last_day()
        --> �־��� ��¥�� ���� ���� ������ ��¥�� ��ȯ�ϴ� �Լ�.
        select last_day(sysdate) from dual;
        
        
        --2. ���� ����
        -- 1-1) concat('���ڿ�', '���ڿ�2')
        --> �� ���ڿ��� �������ִ� �Լ�.
        select concat('�Ӽ���', '����') as fact from dual;
        -- 1-2) || ������: ���ڿ� ���� ������.
        select '��ȯ����' || '����' as "���ϰ�ʹ�" from dual;
        -- 2) upper() : �ҹ��ڸ� �빮�ڷ� �ٲٴ� �Լ�.
        select upper('uppercut') from dual;
        -- 3) lower(): �빮�ڸ� �ҹ��ڷ� �ٲٴ� �Լ�.
        select lower('LOWBLOW') from dual;
        -- 4) substr('���ڿ�', x, y): ���ڿ��� x���� y ���̸�ŭ �������ִ� �Լ�.
        select substr('hecarim', 3, 4) from dual;
        --> ���� ������ ���� ������(����)�������� ���۵�.
        select substr('ABCDEFG', -3, 2) from dual;
        
        -- 5) �ڸ����� �ø��� �Լ�
            -- 5-1) lpad('���ڿ�', '��ü�ڸ���' '�þ�ڸ����� �� ���ڿ�');
        select lpad('ABCDEFG', 15, '*') from dual;
        select rpad('ABCDEFG', 15, '*') from dual;
        -- 6) ���ڸ� �����ִ� �Լ�
            -- 6-1) ltrim(): ���� ���ڸ� ������
            select ltrim('ABCDEFG', 'A') from dual;
            -- 6-2) rtrim(): ������ ���ڸ� ������
            select rtrim('ABCDEFG', 'A') from dual;
        -- 7) replace(): ���ڿ��� ��ü���ִ� �Լ�. 
            -- ����) replace('�������ڿ�', '��ü�ɹ��ڿ�', '���ο�ڿ�');
            select replace('ABCDEFG', 'CDEF', 'FUCK') from dual;
        
            -- [����1] emp ���̺��� ����� �Ʒ��� ���� ��������
            -- ȭ�鿡 �����ּ���.
            -- ���) 'SCOTT�� �������� ANALYST �Դϴ�.'
            -- ��, concat() �Լ��� �̿��ϼ���.
            select concat(ename || '�� �������� ' || job, ' �Դϴ�') from emp;

            -- [����2] emp ���̺��� ����� �Ʒ��� ���� ��������
            -- ȭ�鿡 �����ּ���.
            -- ���) 'SCOTT�� ������ 36000�Դϴ�.'
            -- ��, concat() �Լ��� �̿��ϼ���.
            select concat(ename || '�� ������' || sal*12, '�Դϴ�') from emp;

            -- [����3] member10 ���̺��� ����� �Ʒ��� ���� ��������
            -- ȭ�鿡 �����ּ���.
            -- ���) 'ȫ�浿 ȸ���� ������ �л��Դϴ�.'
            -- ��, concat() �Լ��� �̿��ϼ���.
            
            
            -- [����4] emp ���̺��� ���, �̸�, �������� ȭ�鿡
            -- �����ּ���. ��, �������� �ҹ��ڷ� �����Ͽ� �����ּ���.
            
            
            -- [����5] �������� �ֹε�� ��ȣ �߿��� ��������� �����Ͽ�
            -- ȭ�鿡 �����ּ���.
            
            
            -- [����6] emp ���̺��� �������� 'A' ��� ���ڸ�
            -- '$'�� �ٲپ� ȭ�鿡 �����ּ���.
            
            
            -- [����7] member10 ���̺��� ������ '�л�' �� ������
            -- '���л�'���� �ٲپ� ȭ�鿡 �����ּ���.
            
            
            --[����8] member10 ���̺��� �ּҿ� '�����' �� �� ������
            -- '����Ư����'�� �ٲپ� ȭ�鿡 �����ּ���.
            
            
        --3. ���� ����
        -- 1) abc(����): ������ �����ִ� �Լ�.
        select abs(-23) from dual;
        -- 2) sign(����): ���(1), ����(-1), 0�� ��ȯ���ִ� �Լ�.
        select sign(-15) from dual;
        select sign(-13), sign(0) from dual;
        
        -- 3) round(���): �ݿø� �Լ�
        select round(1234.5555) from dual;
        -- �ݿø� �� �ڸ��� ����(����(�ʼ�)), �ݿø���ġ(����))
        --> ���� ���� �����ϸ� �ڿ��� ������ ���ڸ��� ���� �ݿø� ����
        select round(0.1234574, 6) from dual;
        
        select round(3.342357, 5) from dual;
        select round(1256.5678, -2) from dual;
        
        -- 4) trunc(): �Ҽ��� ���� �ڸ����� �߶󳻴� �Լ�.
            --����) trunc(����(�ʼ�), ������ġ(����));
        select trunc(1234.1234567, 0) from dual;
        select trunc(1234.1234567, 4) from dual;
        select trunc(1234.1234567, -3) from dual;
        
        -- 5) ceil(): ������ �ø� �Լ�.
        select ceil(22.1) from dual;
        -- 6) power():�����Լ�.
        select power(2, 4) from dual;
        -- 7) mod(): ������ �Լ�.
        -- ����) mod((�������� ����), (���� ����));
        select mod(77, 4) from dual;
        -- sprt(): �������� �����ִ� �Լ�
        select sqrt(3) from dual;
        /*
            �ڡڡڡڡڡڡڡڡڡڡڡ�
            ��������
            - �ϳ��� ������ �ȿ� ���Ե� �� �ϳ��� �������� ����Ŵ.
            - ������ �ȿ� �� �ٸ� �������� �ִ� �� ����.
            - ���������� ���������� ���������� �����ϴ� �������� ������.
            - ���� �� ������ �����ؼ� ������ �ִ� ����� �ϳ��� ��ø��
              ���� �������� ����� ���� �� �ְԵ�.
            ** ���ǻ���
                - ���������� ��ȣ�� ��� ���� ���� ������.
                - �������� �ȿ����� order by ���� ����.
            
            - ������: �켱 ���ʿ� ������ ���� ��, �� ������� ���� �ٱ��� ������ ����.
            
        */
        -- emp ���̺��� �̸��� 'SCOTT'�� ����� �޿����� �� ���� �޿��� �޴� ����� ���,
        -- �̸�,����,�޿��� ȭ�鿡 �����ּ���.
        select empno, ename, job, sal from emp 
        where sal > (select sal from emp where ename = 'SCOTT');
        
        select * from emp;
        
        -- [����1] emp ���̺��� ��ձ޿����� �� ���� �޴� �����
-- ���, �̸�, ������, �޿�, �μ���ȣ�� ȭ�鿡 �����ּ���.
        select empno, ename, job, deptno 
        from emp where sal < (select avg(sal) from emp);

-- [����2] emp ���̺��� ����� 7521�� ����� �������� ����,
-- ����� 7934�� ����� �޿����� �� ���� �޴� ����� ���, �̸�, 
-- ������, �޿��� ȭ�鿡 �����ּ���.
        select empno, ename, job, sal from emp 
        where job =(select job from emp where empno='7521') 
        and sal > (select sal from emp where empno = '7934');
        -- �������� WHERE (��������1) AND (��������2)

-- [����3] emp ���̺��� �������� 'MANAGER' �� ����� �ּұ޿�����
-- �����鼭, �������� 'CLERK'�� �ƴ� ����� ���, �̸�, ������,
-- �޿��� ȭ�鿡 �����ּ���.
        select empno, ename, job, sal from emp 
        where sal <(select min(sal) from emp where job = 'MANAGER')
        and job not in('CLERK');

-- [����4] �μ���ġ�� 'DALLAS' �� ����� ���, �̸�, �μ���ȣ, 
-- �������� ȭ�鿡 �����ּ���.
        select empno, ename, e.deptno, job from emp e join dept d
        on e.deptno = d.deptno
        where loc = 'DALLAS';
        

-- [����5] member ���̺� �ִ� ���� ���� �� ���ϸ����� ���� ����
-- ���� ��� ������ ȭ�鿡 �����ּ���.
        


-- [����6] emp ���̺��� �̸��� 'SMITH' �� ������� �� ���� �޿���
-- �޴� ����� �̸���, �޿��� ȭ�鿡 �����ּ���.
        select ename, sal from emp where sal > (select sal from emp where ename= 'SMITH');
        

-- [����7] emp ���̺��� 10�� �μ� �޿��� ��� �޿����� ���� �޿��� �޴�
-- ������� �̸�, �޿�, �μ���ȣ�� ȭ�鿡 �����ּ���.
        select emp

-- [����8] emp ���̺��� 'BLAKE'�� ���� �μ��� �ִ� �������
-- �̸��� �Ի�����, �μ���ȣ�� ȭ�鿡 �����ֵ�, 'BLAKE' �� �����ϰ�
-- ȭ�鿡 �����ּ���.


-- [����9] emp ���̺��� ��ձ޿����� �� ���� �޴� ������� ���,
-- �̸�, �޿��� ȭ�鿡 �����ֵ�, �޿��� �������� ���� ������ ȭ�鿡 
-- �����ּ���.


-- [����10] emp ���̺��� �̸��� 'T'�� �����ϰ� �ִ� ������ ���� �μ���
-- �ٹ��ϰ� �ִ� ����� ����� �̸�, �μ���ȣ�� ȭ�鿡 �����ּ���.



-- [����11] 'SALES' �μ����� �ٹ��ϰ� �ִ� ������� �μ���ȣ,
-- �̸�, �������� ȭ�鿡 �����ּ���.


-- [����12] emp ���̺��� 'KING'���� �����ϴ� ��� �����
-- �̸��� �޿�, �����ڸ� ȭ�鿡 �����ּ���.


-- [����13] emp ���̺��� �ڽ��� �޿��� ��ձ޿����� ����, �̸���
-- 'S' �ڰ� ���� ����� ������ �μ����� �ٹ��ϴ� ��� ����� 
-- ���, �̸�, �޿�, �μ���ȣ�� ȭ�鿡 �����ּ���.


-- [����14] emp ���̺��� ���ʽ��� �޴� ����� �μ���ȣ, �޿��� ����
-- ����� �̸�, �޿�, �μ���ȣ�� ȭ�鿡 �����ּ���.



-- [����15] products ���̺��� ��ǰ�� �ǸŰ����� �ǸŰ�����
-- ��պ��� ū ��ǰ�� ��ü ������ ȭ�鿡 �����ּ���.



-- [����16] products ���̺� �ִ� �Ǹ� ���ݿ��� ��� ���� �̻���
-- ��ǰ ����� ���ϵ�, ����� ���� �� ������ ���� ū �ݾ��� ��ǰ��
-- �����ϰ� ����� ���Ͽ� ȭ�鿡 �����ּ���.


-- [����17] products ���̺��� ��ǰ���� �̸��� '������' �̶��
-- �ܾ ���Ե� ī�װ��� ���ϴ� ��ǰ����� ȭ�鿡 �����ּ���.


-- [����18] member ���̺� �ִ� �� ���� �� ���ϸ����� ���� ���� 
-- �ݾ��� ������ ������ ���ʽ� ���ϸ��� 5000���� �� �־� ����,
-- ���ϸ���, ���ϸ���+5000 ���� ȭ�鿡 �����ּ���.
        
    
    
    
    
    
    
    
    
