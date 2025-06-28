-- PL/SQL Block to promote customers with balance > $10,000 to VIP
DECLARE
    v_threshold NUMBER := 10000;
BEGIN
    FOR customer_rec IN (
        SELECT customer_id
        FROM customers
        WHERE balance > v_threshold
    ) LOOP
        UPDATE customers
        SET is_vip = 'TRUE'
        WHERE customer_id = customer_rec.customer_id;

        DBMS_OUTPUT.PUT_LINE('Customer ID ' || customer_rec.customer_id || ' marked as VIP.');
    END LOOP;
END;
/
