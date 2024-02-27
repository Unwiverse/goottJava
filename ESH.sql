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
    
    
    
    
    
    
