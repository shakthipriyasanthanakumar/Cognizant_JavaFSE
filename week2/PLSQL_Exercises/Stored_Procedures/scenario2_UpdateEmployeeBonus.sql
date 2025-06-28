CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
  p_dept_id IN NUMBER,
  p_bonus_percent IN NUMBER
) IS
BEGIN
  UPDATE employees
  SET salary = salary + (salary * p_bonus_percent / 100)
  WHERE department_id = p_dept_id;

  COMMIT;
END;
/
