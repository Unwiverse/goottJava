 /*
    group by ��
    - Ư�� Į���̳� ���� �������� �ش� ���ڵ带 ��� �ڷḦ ������ �� ��.
    - ������ Ư�� ���� �������� ���踦 ���ϴµ� ���� ����.
    - ���� �׷��Լ��� �Բ� ���� ȿ�������� Ȱ�� ����.
    */
    select distinct deptno from emp order by deptno;
    
    select deptno from emp group by deptno;
    --emp ���̺��� �μ����� �ش� �μ��� �ο��� Ȯ���ϰ� ���� ��
    select deptno, count(*) from emp group by deptno;
    
    --���̺��� �� �μ����� �μ������� �޿� �հ�� ���ؼ� ȭ�鿡 ��
    select deptno, sum(sal) as coke from emp group by deptno
    order by sum(sal) desc;
    
    --����) emp ���̺��� �μ����� �׷��� ���� �޿� �հ�� �μ��� �ο� ��, �μ��� ��� �޿�
    --      �ִ�޿�, �ּұ޿� ���ؼ� ȭ�鿡 ��
    select deptno, sum(sal), count(ename), avg(sal), max(sal), min(sal) from emp group by
    deptno order by deptno;
    
    /*
        having ��
        - group by �� ������ ���� ������.
        - �ڡڡڡڡڡڡ�group by �� �������� where(������)�� ����.�ڡڡڡڡڡڡ�
        - �ݵ�� group by ���� �����  ������ �༭ ���� �ÿ� ��.
    */
    
    -- products ���̺��� ī�װ� ���� ��ǰ�� ������ ���ؼ� ȭ�鿡 ��
    select category_fk, count(*)
    from products group by category_fk having count(*) >=2;
    
    /*
        �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
        view 
        - �������� ���̺� �ٰ��� ������ ������ ���̺�.
        - view�� ���������� �����͸� ������ϰ�����.
        - view�� ����� �����ͺ��̽��� ���� �� ���� ���̺� ������
          �����͸� ������Ե�.
        - �����ϰ� �ʿ��� ����鸸 ������ ����� �� ���� ��.
        - view�� ���̺�� �����ϰ� ���̺�ó�� ����� ����.
        - view�� ���̺� �����ϱ� ���� �������� ������ �ʿ䰡 ����.
        - ���̺�� ���������� insert, update, delete ����� �԰���.
        - ������ �ַ� �����͸� ��ȸ(select)�� �� ���� ���� ����.
        - view�� �־���?
            1) ���� ���� ������(�߿�) => ���� ��޿� ���� �÷� ������ ���� ��ȸ�� �ǰ� �� �� �ִ�.
            2) ����� ���Ǽ� ����
            
        ����) 
                create view �� �̸�
                as ������;
    */
    -- ���� ���� + �� ���� �� ���� ���� ��ȸ���� ���ؼ�!
    -- �λ�� ��
    -- �÷��� sal, comm(���ʽ�), �÷� ����
    create view emp_insa as select empno, ename, job, mgr, hiredate, deptno
    from emp;
    
    select * from emp_insa;
    
    -- ������ view: sal �� ����
    create view emp_sales as select empno, ename, job, mgr, hiredate, comm, deptno
    from emp;
    
    select * from emp_sales;
    
    -- ȸ��� view: ���� �÷� ����
    create view emp_account as select * from emp;
    select * from emp_account;
    
    insert into emp_account --view������ ���̺� ������ �߰��� ����
        values(9000, 'ANGEL', 'SALESMAN', 7698, sysdate, 1300, 100, 30);
    
    -- view�� �б��������� ���� ��� ������ �߰��Ұ�
    -- �б��������� ����� ���.
    -- �б� �������� ���� �� ������ �� �������� 'with read only'��� �߰�.
    create view emp_view1 as select * from emp with read only;
    
    insert into emp_view1 values(9000, '������', 'MANAGER', 7888, sysdate, 1500, 200, 30); -- ���� �߻�
    
    -- create or replace view
    -- ���� �̸��� view�� ���� �� ���� view�� �����ϰ� ���ο� view�� ����� �ǹ�.
    create or replace view emp_sales as select empno, ename, job, mgr, hiredate, deptno
    from emp with read only;
    
    --2) ����� ���Ǽ� ����
    create or replace view emp_salary
    as select empno, ename,(sal*12+nvl2(comm, comm, 0)) "����"
    from emp with read only;
    
    select * from emp_salary;
    
    create or replace view emp_sample as select * from emp; 
    create or replace view dept_sample as select * from dept;

    -- [����1] �μ����� �μ��� �޿� �հ�, �μ��� �޿� ����� 
-- ���� view�� ����� ȭ�鿡 �����ּ���.
-- ���ǻ���) view�� ���� �� �׷��Լ� ���ÿ��� �ݵ��
--          ��Ī�� ������ �־�� ��.
    select sum(sal) "�޿��հ�", avg(sal) "�޿����" from emp_sample 
    group by deptno;


-- [����2] emp ���̺��� �̿��Ͽ� emp_dept20 �̶�� 
-- view�� ����� �ּ���. ��, �μ���ȣ�� 20�� �μ��� ����
-- ������� ���, �̸�, ������, ������, �μ���ȣ�� 
-- ȭ�鿡 �����ֽñ� �ٶ��ϴ�.
    create view emp_dept20 as select empno, ename, job, mgr, deptno from emp
    where deptno = '20';
    select * from emp_dept20;


-- [����3] emp ���̺��� �� �μ��� �ִ�޿��� �ּұ޿���
-- �����ִ� view�� �����, sal_view��� �̸����� �����
-- ȭ�鿡 �����ּ���.
    create view sal_view as select deptno "�μ���ȣ", min(sal) "�ּұ޿�", max(sal) "�ִ�޿�" from emp
    group by deptno;
    select * from sal_view;
    


-- [����4] �������� 'SALESMAN' �� ����� ���, �̸�,
-- ������, �Ի���, �μ���ȣ�� �÷����� �ϴ� view�� 
-- �����, emp_sale �̶�� view�� ����� ȭ�鿡 �����ּ���.
    create view emp_sale as select empno "���", ename "�̸�", job "������", hiredate "�Ի���",
    deptno "�μ���ȣ" from emp where job = 'SALESMAN';
    select *  from emp_sale;
    
    --view�� ���� �� �÷�������� ���� ���
    -- ������ �� �� ���� �ȵǴ� ���� ��
    CREATE OR REPLACE VIEW emp_view2 AS
    SELECT *
    FROM emp
    WHERE deptno = 1
    WITH READ ONLY;
    
        /*
        Ʈ������(Transaction)?
        -������ ó���� �� ����
        -����Ŭ���� �߻��ϴ� ���� ���� sql ��ɹ�����
        -�ϳ��� ������ �۾� ������ ó���ϴ� �� ����.
        -All or Nothing ������� ó����.
        -����� ���� ���������� ���������� ó���� �Ǹ� ����,
         ���� ���� ��ɾ� �߿��� �ϳ��� �߸��Ǹ�
         ��ü�� ��� ��(�߿�)
        - ��������: ������ �ϰ��� ���� ������ ������ �����ϱ� ���� ��.
        - Ʈ������ ��� �� Ʈ�������� �����ϱ� ���� ��ɾ�.
          1) Ʈ������(insert, update, delete) �۾��� ������
          ���� DB�� �ݿ�, ������ �ִ� �����Ϳ� update ������ �߻���.
          ��� ����ڰ� ����� �������� ����� ��������.
        2) rollback: �۾� �߿� ������ �߻����� ��  Ʈ������(insert, update, delete) 
        ó�� �������� ���� ������ ����� ���� ���·� �ǵ���.
        Ʈ������ �۾� ���� ���.
        ������ �� �������� ���� ����.
        */
    --1. dept��� ���̺� ���� dept_02��� ���̺� ��
    create table dept_02 as select * from dept;
    select * from dept_02;
    
    --2. dept_02 ���̺�ּ� 40�� �μ��� �����ϰ� commit ��
    delete from dept_02 where deptno = 40;
    --3. dept_02 ���̺��� ��ü �����͸� �����غ���.
    delete from dept_02;
    --4. �� �� ���� 20�� �μ������ؼ��� ���ַ��� �ߴµ� �߸��ؼ� ��ü�� �������� �ٽ� ���� ������
    rollback;
    --5. ���� 20�� �μ��� ���ؼ��� �����ϸ� ��.
    delete from dept_02 where deptno ='20';
    --6. ������ ���̽��� ������� ����
    commit;
    
    /*
    savepoint 
    - Ʈ�������� �۰� �����ϴ� �� ����.
    - ����ڰ� Ʈ������ �߰� �ܰ迡�� ����Ʈ�� �����ؼ� Ʈ������ ���� Ư�� savepoint���� rollback�� ��
      �ְ� �ϴ� ��.
    */
    --1.  dept ���̺� ���� & dept_03 �̶�� ���̺� ��
    create table dept_03 as select * from dept;
    
    --2. dept_03 ���̺��� 40�� �μ��� �����ϰ� commit ����.
    delete from dept_03 where deptno =40;
    
    --3. dept_03 ���̺��� 30�� �μ��� ���� ��
    delete from dept_03 where deptno = 30;
    
    --4. �� �� savepoint sql�� ���� �� 
    savepoint sp1; 
    
    --5. dept_03 ���̺��� 20�� �μ� ���� ��
    delete from dept_03 where deptno = 20;
    
    --6. �� �� savepoint sql2�� ���� ��
    savepoint sp2;
    --7. dept_03 ���̺��� 10�� �μ��� �����غ���.
    delete from dept_03 where deptno =10;
    
    --sql �μ���ȣ�� 20���� �μ��� �����ϱ� �ٷ� ������ �ǵ��ư������ ��
    rollback sp1;
    select * from dept_03;