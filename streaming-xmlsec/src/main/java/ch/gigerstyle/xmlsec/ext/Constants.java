package ch.gigerstyle.xmlsec.ext;

import ch.gigerstyle.xmlsec.impl.XMLEventNSAllocator;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.util.XMLEventAllocator;

/**
 * User: giger
 * Date: May 13, 2010
 * Time: 3:52:53 PM
 * Copyright 2010 Marc Giger gigerstyle@gmx.ch
 * <p/>
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the
 * Free Software Foundation; either version 2, or (at your option) any
 * later version.
 * <p/>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 */
public class Constants {
    public static final XMLInputFactory xmlInputFactory = XMLInputFactory.newFactory();
    public static final XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newFactory();

    public static final XMLEventFactory xmlEventFactory = XMLEventFactory.newFactory();

    protected static final XMLEventAllocator xmlEventAllocator = new XMLEventNSAllocator();

    static {
        xmlInputFactory.setEventAllocator(xmlEventAllocator);
    }

    private Constants() {
    }

    public static final String NS_XMLENC = "http://www.w3.org/2001/04/xmlenc#";
    public static final String NS_DSIG = "http://www.w3.org/2000/09/xmldsig#";
    public static final String NS_WSSE = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
    public static final String NS_WSU = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd";
    public static final String NS_SOAP11 = "http://schemas.xmlsoap.org/soap/envelope/";

    public static final String PREFIX_SOAPENV = "env";
    public static final QName TAG_soap11_Envelope = new QName(NS_SOAP11, "Envelope", PREFIX_SOAPENV);
    public static final QName TAG_soap11_Header = new QName(NS_SOAP11, "Header", PREFIX_SOAPENV);
    public static final QName TAG_soap11_Body = new QName(NS_SOAP11, "Body", PREFIX_SOAPENV);

    public static final String PREFIX_WSSE = "wsse";
    public static final QName TAG_wsse_Security = new QName(NS_WSSE, "Security", PREFIX_WSSE);

    public static final String PREFIX_XENC = "xenc";
    public static final QName TAG_xenc_EncryptedKey = new QName(NS_XMLENC, "EncryptedKey", PREFIX_XENC);
    public static final QName ATT_NULL_Id = new QName(null, "Id");
    public static final QName ATT_NULL_Type = new QName(null, "Type");
    public static final QName ATT_NULL_MimeType = new QName(null, "MimeType");
    public static final QName ATT_NULL_Encoding = new QName(null, "Encoding");

    public static final QName TAG_xenc_EncryptionMethod = new QName(NS_XMLENC, "EncryptionMethod", PREFIX_XENC);
    public static final QName ATT_NULL_Algorithm = new QName(null, "Algorithm");

    public static final String PREFIX_DSIG = "dsig";
    public static final QName TAG_dsig_KeyInfo = new QName(NS_DSIG, "KeyInfo", PREFIX_DSIG);

    public static final QName TAG_wsse_SecurityTokenReference = new QName(NS_WSSE, "SecurityTokenReference", PREFIX_WSSE);
    public static final QName TAG_wsse_Reference = new QName(NS_WSSE, "Reference", PREFIX_WSSE);
    public static final QName ATT_wsse_Usage = new QName(NS_WSSE, "Usage", PREFIX_WSSE);

    public static final QName TAG_wsse_KeyIdentifier = new QName(NS_WSSE, "KeyIdentifier", PREFIX_WSSE);
    public static final QName ATT_NULL_EncodingType = new QName(null, "EncodingType");
    public static final QName ATT_NULL_ValueType = new QName(null, "ValueType");

    public static final QName TAG_xenc_EncryptionProperties = new QName(NS_XMLENC, "EncryptionProperties", PREFIX_XENC);

    public static final QName TAG_xenc_CipherData = new QName(NS_XMLENC, "CipherData", PREFIX_XENC);

    public static final QName TAG_xenc_CipherValue = new QName(NS_XMLENC, "CipherValue", PREFIX_XENC);

    public static final QName TAG_xenc_ReferenceList = new QName(NS_XMLENC, "ReferenceList", PREFIX_XENC);

    public static final QName TAG_xenc_DataReference = new QName(NS_XMLENC, "DataReference", PREFIX_XENC);
    public static final QName ATT_NULL_URI = new QName(null, "URI");

    public static final QName TAG_wsse_BinarySecurityToken = new QName(NS_WSSE, "BinarySecurityToken", PREFIX_WSSE);
    public static final String PREFIX_WSU = "wsu";
    public static final QName ATT_wsu_Id = new QName(NS_WSU, "Id", PREFIX_WSU);

    public static final QName TAG_xenc_EncryptedData = new QName(NS_XMLENC, "EncryptedData", PREFIX_XENC);

    public static final QName TAG_dsig_Signature = new QName(NS_DSIG, "Signature", PREFIX_DSIG);

    public static final QName TAG_dsig_SignedInfo = new QName(NS_DSIG, "SignedInfo", PREFIX_DSIG);

    public static final QName TAG_dsig_CanonicalizationMethod = new QName(NS_DSIG, "CanonicalizationMethod", PREFIX_DSIG);

    public static final QName TAG_dsig_SignatureMethod = new QName(NS_DSIG, "SignatureMethod", PREFIX_DSIG);

    public static final QName TAG_dsig_Reference = new QName(NS_DSIG, "Reference", PREFIX_DSIG);

    public static final QName TAG_dsig_Transforms = new QName(NS_DSIG, "Transforms", PREFIX_DSIG);

    public static final QName TAG_dsig_Transform = new QName(NS_DSIG, "Transform", PREFIX_DSIG);

    public static final QName TAG_dsig_DigestMethod = new QName(NS_DSIG, "DigestMethod", PREFIX_DSIG);

    public static final QName TAG_dsig_DigestValue = new QName(NS_DSIG, "DigestValue", PREFIX_DSIG);

    public static final QName TAG_dsig_SignatureValue = new QName(NS_DSIG, "SignatureValue", PREFIX_DSIG);

    public static final QName TAG_wsu_Timestamp = new QName(NS_WSU, "Timestamp", PREFIX_WSU);
    public static final QName TAG_wsu_Created = new QName(NS_WSU, "Created", PREFIX_WSU);
    public static final QName TAG_wsu_Expires = new QName(NS_WSU, "Expires", PREFIX_WSU);

    public static final QName TAG_dsig_X509Data = new QName(NS_DSIG, "X509Data", PREFIX_DSIG);
    public static final QName TAG_dsig_X509IssuerSerial = new QName(NS_DSIG, "X509IssuerSerial", PREFIX_DSIG);
    public static final QName TAG_dsig_X509IssuerName = new QName(NS_DSIG, "X509IssuerName", PREFIX_DSIG);
    public static final QName TAG_dsig_X509SerialNumber = new QName(NS_DSIG, "X509SerialNumber", PREFIX_DSIG);

    public static final String NS10_SOAPMESSAGE = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0";
    public static final String NS11_SOAPMESSAGE = "http://docs.oasis-open.org/wss/oasis-wss-soap-message-security-1.1";

    public static final String NS_X509TOKEN = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-x509-token-profile-1.0";

    public static final String NS_X509_V3_TYPE = NS_X509TOKEN + "#X509v3";
    public static final String NS_X509PKIPathv1 = NS_X509TOKEN + "#X509PKIPathv1";
    public static final String NS_X509SubjectKeyIdentifier = NS_X509TOKEN + "#X509SubjectKeyIdentifier";
    public static final String NS_THUMBPRINT = NS11_SOAPMESSAGE + "#ThumbprintSHA1";

    public static final String SOAPMESSAGE_NS10_BASE64_ENCODING = NS10_SOAPMESSAGE + "#Base64Binary";

    public static final String CACHED_EVENTS = "CACHED_EVENTS";

    public enum Action {
        TIMESTAMP,
        SIGNATURE,
        ENCRYPT,
    }

    public enum KeyIdentifierType {
        ISSUER_SERIAL,
        BST_DIRECT_REFERENCE,
        BST_EMBEDDED,
        X509_KEY_IDENTIFIER,
        SKI_KEY_IDENTIFIER,
        THUMBPRINT_IDENTIFIER,
        EMBEDDED_KEYNAME,
        //EMBED_SECURITY_TOKEN_REF,
    }
}
