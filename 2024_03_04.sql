 /*
    PL/SQL(Procedual Language / SQL)
    - SQL �����δ� ������ ��ưų� �Ұ����� �۾��� �����ϱ� ����
      ����Ŭ���� �����ϴ� ���α׷��� �� ����.
    - �Ϲ������� ���α׷��� ������� ��ҵ����� ���� ������ DB
      ������ ó���ϱ� ���� ����ȭ�� ���.
    - ����, ���� ó��, �ݺ� ó�� �� �پ��� ����� �� �� ����.
    - PL/SQL�� ���ø����̼� ���� �ʿ��� ����Ǵ� ���� �ƴϰ� �����ͺ��̽� 
      ���� �ʿ��� �����. ���� �����Ϳ� ���� ����� ���� ��ġ�ϰ� �����Ƿ�
      ���ø����̼� ������ �����͸� �ְ�޴µ� ������ ��Ʈ��ũ Ʈ������ �ּ�ȭ �ȴٴ� ������ ����.
      
      
    - �⺻ ����
      1) �����(declare): ��� ������ ����� �����ϴ� �κ�.
      2) �����(executable - begin)
         - ���� ������ ����Ǵ� �κ�
         - ���(���ǹ�), �ݺ��� �Լ� ���� ���� ���� ��� �κ�.
      3) ����ó����(exception): ���� ���� ���� �߻� �� �ذ��ϱ� ���� ��ɵ��� ����ϴ� �κ�.
      
      ** �� �⺻ ���� �߿��� ����ο� ����ó���δ� ������ �Ǵµ�, ����δ� �־�ߵ�.
      
      - PL/SQL ��� �� ���ǻ���
      1) �⺻���� Ű����(�� ��)�ڿ��� �����ݷ��� ������ �ʴ´�.
      2) ���� �� �κп��� �����ؾ� �Ǵ� ���� ������ �ݵ�� �����ݷ��� ���δ�.
      3) begin - end(�����) �ؿ��� �ݵ�� "/"�� �ٿ���ߵ�.
    */
      -- ȭ�鿡 ��� ����� Ȱ��ȭ������ߵ�
      set serveroutput on;
    
      -- "������ ���ǵ��" ������ PL/SQL�� �Ἥ ����غ���
      begin
      -- ȭ��(�ܼ�)�� ���� ��� ��ɹ�
      dbms_output.put_line('������ ���ǵ��');
      end;
      /
      
      --�����(declare) ������ ������ �����ϴ� ��
      -- 1) ��Į�� �ڷ���
      --          ����) ������ �ڷ���(ũ��)
       --             ��) num number; name varchar2(30);
       
       declare 
            v_empno number(4) := 7788;
            v_ename varchar2(30);
       begin
            v_ename := 'ADAMS';
            
            dbms_output.put_line('v_empno: ' || v_empno);
            dbms_output.put_line('v_ename: ' || v_ename);
       end;
       /
      -- 2) ���۷��� �ڷ���
      /*
      ���̺� ����� �÷��� �ڷ����� ũ�⸦ ��� �ľ��ϰ� ������
      ���� ������, ��κ� �׷��� ���ؼ� ����Ŭ������ ���۷��� ������ ��������.
            ����) ������ ���̺��.�÷�%type;
            ��) num emp.empno%type;
      */
      declare 
        e_empno emp.empno%type;
        e_ename emp.ename%type;
      begin
        e_empno := 7900;
        e_ename := 'SCOTT';
        
        dbms_output.put_line('e_empno: ' || e_empno);
        dbms_output.put_line('e_ename: ' || e_ename);
      end;
      /
      
      -- 3) rowtype �ڷ���
      /*
      ���̺��� ��� �÷��� �Ѳ����� �����ϱ� ���� ������ �����ϴ� ���.
      ����)
            e_row emp%rowtype;
    */
        
        declare 
          emp_row emp%rowtype;
        begin
          select * into emp_row
          from emp
          where empno = 7698;
          
          dbms_output.put_line(emp_row.empno || emp_row.ename || emp_row.job || emp_row.mgr || emp_row.hiredate);
        
        end;
        /
        declare 
    dept_row dept%rowtype;
begin
    select * into dept_row
    from dept
    where deptno = 30;
    
    dbms_output.put_line(dept_row.dname || '');
    
end;
/
        
        /*
        ���� ���(���ǹ�)
        - Ư�����ǽ��� ���� ��Ȳ�� ���� ������ ������ �޸��ϴ�
          ����� ��ɹ��� ����.
        1. if ���ǹ�
            1) if - then ���ǹ�
            : Ư�� ������ ������ ���� �۾��� ����.
            ����) 
                    if ���ǽ� then
                        ���ǽ��� ���� ��� ���� ����;
                    end if;
        
            
            2) if - then - else ���ǹ�
                    Ư�� ������ �����ϴ� ���� �ȱ׷� ���
                    ���� ������ �۾��� ����.
                    ����)
                        if ���ǽ� then
                            ���ǽ��� ���� ��� ���� ����;
                            
                        else 
                            ���ǽ��� ������ ��� ���� ����;
                        end if;
            
            3) if - then - elsif ���ǹ�
                �������� ���ǿ� ���� ���� ������ �۾��� ����.
                 ����) 
                        if ���ǽ�: then
                            ���ǽ�1�� ���̸� ������ ����;
                        elsif ���ǽ�2 then
                        ���ǽ�1�� ����, ���ǽ�2�� ���̸� ������ ����.
                        elsif ���ǽ�3 then
                        ���ǽ�2�� ����, ���ǽ�3�� ���̸� ������ ����.
                        else 
                         ���ǽ� 123�� ��� ������ ��� ���� ����.
                         end if;
        
        */
    
-- 1) if - then
    declare 
    e_number number :=77;
    begin 
        if e_number >= 50 then
        dbms_output.put_line(e_number || ' ��(�� 50���� ū ���Դϴ�.');
        end if;
        end;
        /

--2) if - then - else

--����) ������ ����ִ� ���� Ȧ������ ¦������ �Ǻ��ؼ�
--      ȭ�鿡 ��� ����
    declare
    phallus number := 65;
    begin 
        if mod(phallus, 2) = 0 then
        dbms_output.put_line(phallus || '�� ¦���Դϴ�.');
        else
        dbms_output.put_line(phallus || '�� Ȧ���Դϴ�.');
        end if;
        end;
        /
        
        --3) if - then - elsif ���ǹ�
        declare 
            e_avg number(5, 2) := 88.12;
            
        begin 
            if e_avg  >= 90 then
            dbms_output.put_line('A�����Դϴ�.');
            elsif e_avg >= 80 then
            dbms_output.put_line('B�����Դϴ�.');
             elsif e_avg >= 70 then
            dbms_output.put_line('C�����Դϴ�.');
            end if;
            end;
            /
            
        -- Ű����� �����͸� �Է¹޴� ���
        declare 
    e_num number;
begin 
    e_num := &num; -- ����� �Է� �ޱ�
    dbms_output.put_line('�Է¹��� ������: ' || e_num);
end;
/
        
        /*
         2. case ���ǹ�
            ����) 
                case 
                    when ��1: then
                        ��1�϶� ������ ����;
                    when ��2: then
                        ��2�϶� ������ ����;
                    when ��3: then 
                        ��3�϶� ������ ����;
                    else
                        123 �� �ƴ� �� ������ ����.
                    end case;
            */
            
        --����) Ű����� ���� �Է¹޾Ƽ� ���� ��� ��
    declare 
    studscr number;
    begin 
    studscr := &score;
    case trunc(studscr/10)
        when 9 then
            dbms_output.put_line('���߽��ϴ�.');
        when 8 then
            dbms_output.put_line('���߽��ϴ�.');
        else
            dbms_output.put_line('���� ����');
    end case;
    end;
    /
    
    /*
    �ݺ� ���
        - Ư�� �۾��� �ݺ��� �����Ϸ��� �� ���� ���.
        - �ݺ� ����� ����
            1) �⺻ loop
                - ���� �⺻���� �ݺ���
            2) while loop
                - Ư�� ������ ����� ���� �ݺ��� �����ϴ� �ݺ���
            3) for loop
                - �ݺ� Ƚ���� ���� �ݺ��� ������
        - �ݺ����� ���� ���� ��ɾ�
            1) exit
                - �������� �ݺ��� ��� �ߴܽ�Ŵ
            2) exit - then
                - �ݺ� ���Ḧ ���� ���ǽ��� �����ϰ� �����ϸ� 
                  �ݺ��� �����Ű�� ��ɾ�
            3) continue
                - ���� ���� �ݺ��� ���� �ֱ⸦ �ǳʶٴ� ��ɾ�
            4) continue - when 
                - Ư�� ���ǽ��� �����ϰ� ���ǽ��� �����ϸ� �ݺ� �ֱ⸦
                  �ǳʶ�
    */
    -- �⺻ loop �ݺ��� �Ẹ��
    declare
        e_num number := 1;
        begin
            loop
                dbms_output.put_line('e_num: ' || e_num);
                e_num := e_num +1;
                
                if e_num > 10 then
                exit;
                end if;
                
            end loop;
            end;
            /
            
        -- while loop
        declare 
    e_su number := 1;
    e_sum number := 0;
begin 
    dbms_output.put_line('1~100������ ��');
    while e_su <= 100 loop
        e_sum := e_sum + e_su;
        e_su := e_su + 1;
    end loop;
    dbms_output.put_line('�� ��: ' || e_sum);
end;
/

 --for loop ����
 declare
    e_tot number := 0;
    begin
        dbms_output.put_line('for loop�� �� 1~100������ ��');
        for e_num in 1 .. 100 loop 
        e_tot := e_tot + e_num;
        end loop;
        dbms_output.put_line('����: ' || e_tot);
    end;
    /