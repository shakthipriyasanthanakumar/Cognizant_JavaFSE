-- PL/SQL Block to print reminders for loans due in next 30 days
DECLARE
    v_today DATE := SYSDATE;
BEGIN
    FOR loan_rec IN (
        SELECT loan_id, customer_id, due_date
        FROM loans
        WHERE due_date BETWEEN v_today AND v_today + 30
    ) LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Loan ID ' || loan_rec.loan_id || 
                             ' for Customer ID ' || loan_rec.customer_id || 
                             ' is due on ' || TO_CHAR(loan_rec.due_date, 'DD-MON-YYYY'));
    END LOOP;
END;
/
