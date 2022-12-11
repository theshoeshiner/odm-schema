package org.cdisc.odm.v132;

public interface HasAuditRecordOrId {

	public default ODMcomplexTypeDefinitionAuditRecord getAuditRecordOrId() {
		return getAuditRecordID() != null ? (ODMcomplexTypeDefinitionAuditRecord) getAuditRecordID() : getAuditRecord();
    }
	
	public ODMcomplexTypeDefinitionAuditRecord getAuditRecord();
	
	public Object getAuditRecordID();
	
}
