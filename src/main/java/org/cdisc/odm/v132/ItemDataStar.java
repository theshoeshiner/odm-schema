package org.cdisc.odm.v132;

public interface ItemDataStar extends HasAuditRecordOrId {
	
	public Object getValue();

    public String getItemOID() ;

    public void setItemOID(String value) ;

    public TransactionType getTransactionType() ;

    public void setTransactionType(TransactionType value);

    public Object getAuditRecordID();
    
    public default ODMcomplexTypeDefinitionAuditRecord getAuditRecord() {
    	return (ODMcomplexTypeDefinitionAuditRecord) getAuditRecordID();
    }

    public void setAuditRecordID(Object value);
    
    public Object getSignatureID();

    public void setSignatureID(Object value) ;

    public Object getAnnotationID();

    public void setAnnotationID(Object value) ;

    public String getMeasurementUnitOID() ;

    public void setMeasurementUnitOID(String value) ;

}
