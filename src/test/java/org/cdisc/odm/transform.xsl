<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="2.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:mdsol="http://www.mdsol.com/ns/odm/metadata"
	xmlns:odm="http://www.cdisc.org/ns/odm/v1.3"
	xmlns="http://www.cdisc.org/ns/odm/v1.3">


	<xsl:template match="@*|node()">
		<xsl:copy>
			<xsl:apply-templates select="@*|node()" />
		</xsl:copy>
	</xsl:template>

	<!-- Change tag anme -->

	<xsl:template match="odm:UserRef">
		<OdmUserRef>
			<xsl:apply-templates select="@*|node()" />
		</OdmUserRef>
	</xsl:template>

	<!-- replace att value -->

	<xsl:template match="odm:UserRef/@UserOID">
		<xsl:attribute name="UserOID">
			<xsl:value-of select="'userOIDvalue'" />
		</xsl:attribute>
	</xsl:template>





	<!-- Select the query tag, rename it and add all attributes -->

	<xsl:template match="mdsol:Query">
		<QueryData>
			<xsl:apply-templates select="@*|node()" />
		</QueryData>
	</xsl:template>

	<xsl:template match="mdsol:Query/@QueryRepeatKey">
		<xsl:attribute name="id">
      <xsl:value-of select="." />
   		</xsl:attribute>
	</xsl:template>

	

	<!-- rename an attribute -->

	<xsl:template match="mdsol:Query/@Value">
		<xsl:attribute name="text">
      <xsl:value-of select="." />
   		</xsl:attribute>
	</xsl:template>

	<!-- map an attribute to a new value -->

	<xsl:template match="mdsol:Query/@Status">
		<xsl:attribute name="status">
			<xsl:choose>
				<xsl:when test="current() = 'Open'">ISOPEN</xsl:when>
				<xsl:otherwise>NOTOPEN</xsl:otherwise>
			</xsl:choose>
   		</xsl:attribute>
	</xsl:template>


	<!-- copy an attribute without removing -->

	<xsl:template match="odm:SubjectData/@SubjectKey">
		<xsl:attribute name="SubjectKey">
		<xsl:value-of select="." />
		</xsl:attribute>
		<xsl:attribute name="internalid">
		 	<xsl:value-of select="." />
		</xsl:attribute>
	</xsl:template>

	<!-- Remove an attribute -->

	<xsl:template match="odm:SubjectData/@mdsol:SubjectKeyType">
	</xsl:template>

	<!-- parse an attribute into multiple values -->

	<xsl:template match="odm:SubjectData/@mdsol:SubjectName">

		<!-- tokenize values to variable -->

		<xsl:variable name="token" select="." />
		
		<xsl:variable name="tokens" select="tokenize($token, '-')" />
		
		<!-- keep selected attribute -->

		<xsl:attribute name="SubjectName">
			<xsl:value-of select="." />
		</xsl:attribute>
		
		<!-- copy tokens to other attributes -->
		
		<xsl:attribute name="subjectname">
		 	<xsl:value-of select="$tokens[1]" /> 
		 </xsl:attribute>

		<xsl:attribute name="siteid">
		 	<xsl:value-of select="$tokens[2]" /> 
		 </xsl:attribute>

	</xsl:template>


</xsl:stylesheet>