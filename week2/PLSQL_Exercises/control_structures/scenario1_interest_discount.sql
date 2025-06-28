-- PL/SQL Block to apply 1% discount on loan interest rates for senior customers
DECLARE
    v_discount_rate NUMBER := 0.01; -- 1% discount
BEGIN
    FOR customer_rec IN (
        SELECT customer_id
        FROM customers
        WHERE age > 60
    ) LOOP
        UPDATE loans
        SET loan_interest_rate = loan_interest_rate * (1 - v_discount_rate)
        WHERE customer_id = customer_rec.customer_id;

        DBMS_OUTPUT.PUT_LINE('Discount applied to Customer ID: ' || customer_rec.customer_id);
    END LOOP;
END;
/
