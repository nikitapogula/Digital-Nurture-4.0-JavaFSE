CREATE OR REPLACE TRIGGER LOGTRANSACTIONS
AFTER INSERT ON TRANSACTIONS
FOR EACH ROW
BEGIN
    INSERT INTO AUDITLOG (LOGID, TRANSACTIONID, ACCOUNTID, TRANSACTIONDATE, AMOUNT, TRANSACTIONTYPE)
    VALUES (AUDITLOG_SEQ.NEXTVAL, :NEW.TRANSACTIONID, :NEW.ACCOUNTID, SYSDATE, :NEW.AMOUNT, :NEW.TRANSACTIONTYPE);
    DBMS_OUTPUT.PUT_LINE('INSERT SUCCESSFUL');
END LOGTRANSACTIONS;
/