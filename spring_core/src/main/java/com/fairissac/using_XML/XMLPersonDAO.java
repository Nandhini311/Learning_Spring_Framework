package com.fairissac.using_XML;

import org.springframework.beans.factory.annotation.Autowired;

public class XMLPersonDAO {
    XMLJdbcConnection XML_jdbcConnection;

    public XMLJdbcConnection getJdbcConnection(){
        return XML_jdbcConnection;
    }
    public void setXMLJdbcConnection(XMLJdbcConnection xmlJdbcConnection){
        this.XML_jdbcConnection = xmlJdbcConnection;
    }
}
