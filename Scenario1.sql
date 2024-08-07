BEGIN
    -- Update interest rates for customers older than 60
    UPDATE LOANS
    SET INTEREST_RATE = INTEREST_RATE - 0.01
    WHERE CUSTOMER_ID IN (
        SELECT CUSTOMER_ID
        FROM CUSTOMERS
        WHERE TRUNC(MONTHS_BETWEEN(SYSDATE, DATE_OF_BIRTH) / 12) > 60
    );

    -- Commit the transaction to save changes
    COMMIT;
EXCEPTION
    WHEN OTHERS THEN
        -- Rollback changes if an error occurs
        ROLLBACK;
        -- Output error message
        DBMS_OUTPUT.PUT_LINE('An error occurred: ' || SQLERRM);
END;
/
