
import java.io.IOException;
import java.io.PrintWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yukun.peng
 */
public class Email {
    public static void main(String [ ] args){}
    
   public static String ReturnInviteEmailHTML(String[] args) {
       
      String propertyname=args[0];
      String bodytext=args[1];
      String url=args[2];
      String disclamier=args[3];
      String previewdate=args[4]; 
      String img1=args[5];
      String img2=args[6];
      String img3=args[7];
      String heroimage=args[8];
      String bodytext2=args[9];
      String auctiondate=args[10];
      String openhouse=args[11];
      String rsvplink=args[12];
      String headline=args[13];
        
        
        
        
        
        
        
        
        
        
        String html="<!doctype html>\n" +
"<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\">\n" +
"\n" +
"<head>\n" +
"  <!-- NAME: 1:3:2 COLUMN -->\n" +
"  <!--[if gte mso 15]>\n" +
"        <xml>\n" +
"            <o:OfficeDocumentSettings>\n" +
"            <o:AllowPNG/>\n" +
"            <o:PixelsPerInch>96</o:PixelsPerInch>\n" +
"            </o:OfficeDocumentSettings>\n" +
"        </xml>\n" +
"        <![endif]-->\n" +
"  <meta charset=\"UTF-8\">\n" +
"  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
"  <title>*|MC:SUBJECT|*</title>\n" +
"  <!-- Added by Hubspot 3/2/16 -->\n" +
"  <!-- Preview text (text which appears right after subject) -->\n" +
"  <div id=\"preview_text\" style=\"display:none!important\">\n" +
"    {% text \"preview_text\" label=\"Preview Text <span class=help-text>This will be used as the preview text that displays in some email clients</span>\", value=\"\", no_wrapper=True %}\n" +
"  </div>\n" +
"\n" +
"  <link href='https://fonts.googleapis.com/css?family=Lato:400,700,900' rel='stylesheet' type='text/css'>\n" +
"  <!-- font-family: 'Lato', sans-serif; -->\n" +
"  <style type=\"text/css\">\n" +
"   p {\n" +
"      margin: 10px 0;\n" +
"      padding: 0;\n" +
"    }\n" +
"    \n" +
"    table {\n" +
"      border-collapse: collapse;\n" +
"    }\n" +
"    /*Added by Hubspot 3/2/16*/\n" +
"    /* Hide preview text on rendering */\n" +
"    \n" +
"    #preview_text {\n" +
"      display: none;\n" +
"    }\n" +
"    \n" +
"    img,\n" +
"    a img {\n" +
"      border: 0;\n" +
"      height: auto;\n" +
"      outline: none;\n" +
"      text-decoration: none;\n" +
"    }\n" +
"    \n" +
"    body,\n" +
"    #bodyTable,\n" +
"    #bodyCell {\n" +
"      height: 100%;\n" +
"      margin: 0;\n" +
"      padding: 0;\n" +
"      width: 100%;\n" +
"    }\n" +
"    \n" +
"    img {\n" +
"      -ms-interpolation-mode: bicubic;\n" +
"    }\n" +
"    \n" +
"    table {\n" +
"      mso-table-lspace: 0pt;\n" +
"      mso-table-rspace: 0pt;\n" +
"    }\n" +
"    \n" +
"    p,\n" +
"    a,\n" +
"    li,\n" +
"    td,\n" +
"    blockquote {\n" +
"      mso-line-height-rule: exactly;\n" +
"    }\n" +
"    \n" +
"    a[href^=tel],\n" +
"    a[href^=sms] {\n" +
"      color: inherit;\n" +
"      cursor: default;\n" +
"      text-decoration: none;\n" +
"    }\n" +
"    \n" +
"    p,\n" +
"    a,\n" +
"    li,\n" +
"    td,\n" +
"    body,\n" +
"    table,\n" +
"    blockquote {\n" +
"      -ms-text-size-adjust: 100%;\n" +
"      -webkit-text-size-adjust: 100%;\n" +
"    }\n" +
"    \n" +
"    a[x-apple-data-detectors] {\n" +
"      color: inherit !important;\n" +
"      text-decoration: none !important;\n" +
"      font-size: inherit !important;\n" +
"      font-family: inherit !important;\n" +
"      font-weight: inherit !important;\n" +
"      line-height: inherit !important;\n" +
"    }\n" +
"    \n" +
"    #bodyCell {\n" +
"      padding: 10px;\n" +
"    }\n" +
"    \n" +
"    a.mcnButton {\n" +
"      display: block;\n" +
"    }\n" +
"    \n" +
"    .mcnImage {\n" +
"      vertical-align: bottom;\n" +
"    }\n" +
"    \n" +
"    .mcnTextContent {\n" +
"      word-break: break-word;\n" +
"    }\n" +
"    \n" +
"    .mcnTextContent img {\n" +
"      height: auto !important;\n" +
"    }\n" +
"    \n" +
"    body,\n" +
"    #bodyTable {\n" +
"      background-color: #f9f9f9;\n" +
"      color: rgba(0, 0, 0, .87);\n" +
"    }\n" +
"    \n" +
"    #bodyCell {\n" +
"      border-top: 0;\n" +
"    }\n" +
"    \n" +
"    .templateContainer {\n" +
"      border: 0;\n" +
"    }\n" +
"    \n" +
"    #templatePreheader {\n" +
"      background-color: #F9F9F9;\n" +
"      border-top: 0;\n" +
"      border-bottom: 0;\n" +
"      padding-top: 0px;\n" +
"      padding-bottom: 0px;\n" +
"    }\n" +
"    \n" +
"    #templatePreheader .mcnTextContent,\n" +
"    #templatePreheader .mcnTextContent p {\n" +
"      color: rgba(0, 0, 0, .87);\n" +
"      font-family: lato;\n" +
"      font-size: 12px;\n" +
"      line-height: 150%;\n" +
"      text-align: left;\n" +
"    }\n" +
"    \n" +
"    #templatePreheader .mcnTextContent a,\n" +
"    #templatePreheader .mcnTextContent p a {\n" +
"      color: rgba(0, 0, 0, .87);\n" +
"      font-weight: normal;\n" +
"      text-decoration: underline;\n" +
"    }\n" +
"    \n" +
"    #templateHeader {\n" +
"      background-color: #FFFFFF;\n" +
"      border-top: 0;\n" +
"      border-bottom: 0;\n" +
"      padding-top: 30px;\n" +
"      padding-bottom: 0;\n" +
"    }\n" +
"    \n" +
"    #templateHeader .mcnTextContent,\n" +
"    #templateHeader .mcnTextContent p {\n" +
"      color: rgba(0, 0, 0, .87);\n" +
"      font-family: lato;\n" +
"      font-size: 16px;\n" +
"      line-height: 150%;\n" +
"      text-align: left;\n" +
"    }\n" +
"    \n" +
"    #templateHeader .mcnTextContent a,\n" +
"    #templateHeader .mcnTextContent p a {\n" +
"      font-weight: normal;\n" +
"      text-decoration: underline;\n" +
"    }\n" +
"    \n" +
"    #templateBody {\n" +
"      background-color: #FFFFFF;\n" +
"      border-top: 0;\n" +
"      border-bottom: 0;\n" +
"      padding-top: 0;\n" +
"      padding-bottom: 0;\n" +
"    }\n" +
"    \n" +
"    #templateBody .mcnTextContent,\n" +
"    #templateBody .mcnTextContent p {\n" +
"      color: rgba(0, 0, 0, .87);\n" +
"      font-family: lato;\n" +
"      font-size: 16px;\n" +
"      line-height: 150%;\n" +
"      text-align: left;\n" +
"    }\n" +
"    \n" +
"    #templateBody .mcnTextContent a,\n" +
"    #templateBody .mcnTextContent p a {\n" +
"      font-weight: normal;\n" +
"      text-decoration: underline;\n" +
"    }\n" +
"    \n" +
"    #templateUpperColumns {\n" +
"      background-color: #FFFFFF;\n" +
"      border-top: 0;\n" +
"      border-bottom: 0;\n" +
"      padding-top: 0;\n" +
"      padding-bottom: 0;\n" +
"    }\n" +
"    \n" +
"    #templateUpperColumns .columnContainer .mcnTextContent,\n" +
"    #templateUpperColumns .columnContainer .mcnTextContent p {\n" +
"      color: rgba(0, 0, 0, .87);\n" +
"      font-family: lato;\n" +
"      font-size: 16px;\n" +
"      line-height: 150%;\n" +
"      text-align: center;\n" +
"    }\n" +
"    \n" +
"    #templateUpperColumns .columnContainer .mcnTextContent a,\n" +
"    #templateUpperColumns .columnContainer .mcnTextContent p a {\n" +
"      font-weight: normal;\n" +
"      text-decoration: underline;\n" +
"    }\n" +
"    \n" +
"    #templateLowerColumns {\n" +
"      background-color: #FFFFFF;\n" +
"      border-top: 0;\n" +
"      padding-top: 0;\n" +
"      padding-bottom: 0px;\n" +
"    }\n" +
"    \n" +
"    #templateLowerColumns .columnContainer .mcnTextContent,\n" +
"    #templateLowerColumns .columnContainer .mcnTextContent p {\n" +
"      color: rgba(0, 0, 0, .87);\n" +
"      font-family: lato;\n" +
"      font-size: 16px;\n" +
"      line-height: 150%;\n" +
"      text-align: left;\n" +
"    }\n" +
"    \n" +
"    #templateLowerColumns .columnContainer .mcnTextContent a,\n" +
"    #templateLowerColumns .columnContainer .mcnTextContent p a {\n" +
"      font-weight: normal;\n" +
"      text-decoration: underline;\n" +
"    }\n" +
"    \n" +
"    #templateFooter {\n" +
"      background-color: #FAFAFA;\n" +
"      border-top: 0;\n" +
"      border-bottom: 0;\n" +
"      padding-top: 9px;\n" +
"      padding-bottom: 9px;\n" +
"    }\n" +
"    \n" +
"    #templateFooter .mcnTextContent,\n" +
"    #templateFooter .mcnTextContent p {\n" +
"      color: rgba(0, 0, 0, .87);\n" +
"      font-family: lato;\n" +
"      font-size: 12px;\n" +
"      line-height: 150%;\n" +
"      text-align: center;\n" +
"    }\n" +
"    \n" +
"    #templateFooter .mcnTextContent a,\n" +
"    #templateFooter .mcnTextContent p a {\n" +
"      color: rgba(0, 0, 0, .87);\n" +
"      font-weight: normal;\n" +
"      text-decoration: underline;\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      body,\n" +
"      table,\n" +
"      td,\n" +
"      p,\n" +
"      a,\n" +
"      li,\n" +
"      blockquote {\n" +
"        -webkit-text-size-adjust: none !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      f\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      #bodyCell {\n" +
"        padding-top: 10px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .columnWrapper {\n" +
"        max-width: 100% !important;\n" +
"        width: 100% !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcnImage {\n" +
"        width: 95% !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mobileTitle {\n" +
"        font-size: 28px !important;\n" +
"        padding-bottom: 10px !important;\n" +
"        line-height: 35px;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .menu-container {\n" +
"        padding-top: 10px !important;\n" +
"        padding-bottom: 10px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 374px) and (min-width: 320px) {\n" +
"      .menu-items {\n" +
"        font-size: 10px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) and (min-width: 375px) {\n" +
"      .menu-items {\n" +
"        font-size: 12px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .menu-item {\n" +
"        padding-right: 10px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mobileCatalogText {\n" +
"        padding-left: 0px !important;\n" +
"        padding-right: 0px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .companyLogo {\n" +
"        width: 250px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcnCaptionTopContent,\n" +
"      .mcnTextContentContainer,\n" +
"      .mcnBoxedTextContentContainer {\n" +
"        max-width: 100% !important;\n" +
"        width: 100% !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcnImageBlockInner,\n" +
"      .mcnImageContent {\n" +
"        padding: 0px 6px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcnTextContent {\n" +
"        padding-right: 24px !important;\n" +
"        padding-left: 24px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mobileHeader {\n" +
"        padding: 0 !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcnBoxedTextContentContainer {\n" +
"        min-width: 100% !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcnImageGroupContent {\n" +
"        padding: 9px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcnCaptionLeftContentOuter .mcnTextContent,\n" +
"      .mcnCaptionRightContentOuter .mcnTextContent {\n" +
"        padding-top: 9px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcnImageCardTopImageContent,\n" +
"      .mcnCaptionBlockInner .mcnCaptionTopContent:last-child .mcnTextContent {\n" +
"        padding-top: 18px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcnImageCardBottomImageContent {\n" +
"        padding-bottom: 9px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcnImageGroupBlockInner {\n" +
"        padding-top: 0 !important;\n" +
"        padding-bottom: 0 !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcnImageGroupBlockOuter {\n" +
"        padding-top: 9px !important;\n" +
"        padding-bottom: 9px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcnImageCardLeftImageContent,\n" +
"      .mcnImageCardRightImageContent {\n" +
"        padding-right: 18px !important;\n" +
"        padding-bottom: 0 !important;\n" +
"        padding-left: 18px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcpreview-image-uploader {\n" +
"        display: none !important;\n" +
"        width: 100% !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcnBoxedTextContentContainer .mcnTextContent,\n" +
"      .mcnBoxedTextContentContainer .mcnTextContent p {\n" +
"        font-size: 14px !important;\n" +
"        line-height: 150% !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      #templatePreheader {\n" +
"        display: block !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      #templatePreheader .mcnTextContent,\n" +
"      #templatePreheader .mcnTextContent p {\n" +
"        font-size: 14px !important;\n" +
"        line-height: 150% !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      #templateHeader .mcnTextContent,\n" +
"      #templateHeader .mcnTextContent p {\n" +
"        font-size: 16px !important;\n" +
"        line-height: 150% !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      #templateBody .mcnTextContent,\n" +
"      #templateBody .mcnTextContent p {\n" +
"        font-size: 16px !important;\n" +
"        line-height: 150% !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      #templateUpperColumns .columnContainer .mcnTextContent,\n" +
"      #templateUpperColumns .columnContainer .mcnTextContent p {\n" +
"        font-size: 16px !important;\n" +
"        line-height: 150% !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      #templateLowerColumns .columnContainer .mcnTextContent,\n" +
"      #templateLowerColumns .columnContainer .mcnTextContent p {\n" +
"        font-size: 16px !important;\n" +
"        line-height: 150% !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      #templateFooter .mcnTextContent,\n" +
"      #templateFooter .mcnTextContent p {\n" +
"        font-size: 14px !important;\n" +
"        line-height: 125% !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    .mobileHeader {\n" +
"      min-width: 798px !important;\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mobileHeader {\n" +
"        min-width: 0 !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .socialPane {\n" +
"        border-right: none !important;\n" +
"        padding-right: 0 !important;\n" +
"        padding-left: 0 !important;\n" +
"      }\n" +
"      .mcnFollowContentItemContainer {\n" +
"        padding-bottom: 10px !important;\n" +
"      }\n" +
"      #lastSocial {\n" +
"        padding-right: 0 !important;\n" +
"      }\n" +
"      .shortDescription {\n" +
"        display: none !important;\n" +
"      }\n" +
"      .socialIcons {\n" +
"        padding-top: 14px !important;\n" +
"      }\n" +
"      #horizontalRule {\n" +
"        margin-bottom: 15px !important;\n" +
"      }\n" +
"      .icon-container {\n" +
"        padding-right: 0 !important;\n" +
"        padding-left: 0 !important;\n" +
"      }\n" +
"      .sectionHeaderContainer {\n" +
"        width: 90% !important;\n" +
"      }\n" +
"    }\n" +
"  </style>\n" +
"</head>\n" +
"\n" +
"<body>\n" +
"  <div style=\"display:none; white-space:nowrap; font:15px courier; line-height:0;\">\n" +
"    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;\n" +
"  </div>\n" +
"  <center>\n" +
"\n" +
"    <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" height=\"100%\" width=\"100%\" id=\"bodyTable\">\n" +
"      <tr>\n" +
"        <td align=\"center\" valign=\"top\" id=\"bodyCell\">\n" +
"\n" +
"          <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"templateContainer\">\n" +
"            <tr>\n" +
"              <td valign=\"top\" id=\"templatePreheader\">\n" +
"               \n" +
"                <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnTextBlock\" style=\"max-width:800px; margin: 0 auto;\">\n" +
"                  <tbody class=\"mcnTextBlockOuter\">\n" +
"                    <tr>\n" +
"                      <td valign=\"top\" class=\"mcnTextBlockInner\">\n" +
"\n" +
"                        <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"282\" class=\"mcnTextContentContainer\">\n" +
"                          <tbody>\n" +
"                            <tr>\n" +
"                              <td valign=\"top\" class=\"mcnTextContent\" style=\"padding-top:9px; padding-left:18px; padding-bottom:9px; padding-right:0;\">\n" +
"                              </td>\n" +
"                            </tr>\n" +
"                          </tbody>\n" +
"                        </table>\n" +
"\n" +
"                        <table align=\"right\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"282\" class=\"mcnTextContentContainer\">\n" +
"                          <tbody>\n" +
"                            <tr>\n" +
"                              <td valign=\"top\" class=\"mcnTextContent\" style=\"padding-top:9px; padding-right:18px; padding-bottom:9px; padding-left:18px;\">\n" +
"                                {%if content.create_page%} <div style=\"text-align: right;\"><span style=\"font-size:10px;font-family: 'Lato', sans-serif;color:rgba(0, 0, 0, .87);\">\n" +
"                                  <a href=\"{{view_as_page_url}}\" target=\"_blank\">\n" +
"                        	                     <span style=\"color:rgba(0, 0, 0, .87)\">View in browser</span>{%endif%}\n" +
"                                  </a>\n" +
"                                  </span>\n" +
"                                </div>\n" +
"                              </td>\n" +
"                            </tr>\n" +
"                          </tbody>\n" +
"                        </table>\n" +
"                      </td>\n" +
"                    </tr>\n" +
"                  </tbody>\n" +
"                </table>\n" +
"              </td>\n" +
"            </tr>\n" +
"            <table style=\"max-width: 800px; box-shadow: 0 1px 6px rgba(0,0,0,0.12), 0 1px 4px rgba(0,0,0,0.12); display: inline-block;\">\n" +
"              <tr>\n" +
"                <td valign=\"top\" id=\"templateHeader\">\n" +
"                  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnImageBlock\" style=\"min-width:100%;\">\n" +
"                    <tbody class=\"mcnImageBlockOuter\">\n" +
"                      <tr>\n" +
"                        <td valign=\"top\" style=\"padding:10px 0 0;\" class=\"mcnImageBlockInner heroContainer\">\n" +
"\n" +
"                          <table align=\"left\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"mcnImageContentContainer\" style=\"min-width:100%;\">\n" +
"                            <tbody>\n" +
"                              <tr>\n" +
"                                <td class=\"mcnImageContent\" valign=\"top\" style=\"padding-right: 0px; padding-left: 0px; padding-top: 0; padding-bottom: 10px; text-align:center;\">\n" +
"                                  <a href=\"https://www.conciergeauctions.com\" target=\"_blank\">\n" +
"                                    <img align=\"center\" alt=\"\" src=\"https://cdn2.hubspot.net/hub/114319/hubfs/Logos/CA-logo-header-2.jpg?noresize\" width=\"369\" style=\"width:369; margin-bottom: 20px; display: inline !important; vertical-align: bottom;\" class=\"mcnImage companyLogo\">\n" +
"                                  </a>\n" +
"                                </td>\n" +
"                              </tr>\n" +
"                            </tbody>\n" +
"                          </table>\n" +
"                        </td>\n" +
"                      </tr>\n" +
"                    </tbody>\n" +
"                  </table>\n" +
"\n" +
"                  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnTextBlock\" style=\"min-width:100%;\">\n" +
"                    <tbody class=\"mcnTextBlockOuter\">\n" +
"                      <tr>\n" +
"                        <td valign=\"top\" class=\"mcnTextBlockInner\">\n" +
"\n" +
"                          <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"min-width:100%;\" class=\"mcnTextContentContainer\">\n" +
"                            <tbody>\n" +
"                              <tr>\n" +
"                                <td align=\"center\" valign=\"top\" id=\"templateUpperColumns\">\n" +
"                                  <div class=\"sectionHeaderContainer\" style=\"width: 95%; text-align: center; border-bottom: 1px solid rgba(0,0,0,.12); line-height: 0%; margin-bottom: 25px; margin-top: 25px;\">\n" +
"                                    <span class=\"sectionHeader\" style=\"font-family: 'Lato', sans-serif; font-weight: 600;text-transform: uppercase; background: white; padding: 0 10px; letter-spacing: 2px; font-size: 16px;\">you're invited</span>\n" +
"                                  </div>\n" +
"                                </td>\n" +
"                              </tr>\n" +
"                            </tbody>\n" +
"                          </table>\n" +
"                        </td>\n" +
"                      </tr>\n" +
"                    </tbody>\n" +
"                  </table>\n" +
"\n" +
"                  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnImageBlock\" style=\"min-width:100%;\">\n" +
"                    <tbody class=\"mcnImageBlockOuter\">\n" +
"                      <tr>\n" +
"                        <td valign=\"top\" style=\"\" class=\"mcnImageBlockInner mobileHeader\">\n" +
"\n" +
"                          <table align=\"left\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"mcnImageContentContainer\" style=\"min-width:100%;\">\n" +
"                            <tbody>\n" +
"                              <tr>\n" +
"                                <td class=\"mcnImageContent mobileHeader\" valign=\"top\" style=\"padding-top: 0; padding-bottom: 0; text-align:center;\">\n" +
"                                 <a href=\"https://www.conciergeauctions.com/auctions/856-silvertip-heights-canmore-alberta\" title=\"CANMORE, ALBERTA\" class=\"\" target=\"_blank\">\n" +
"                                    <img align=\"center\" alt=\"\" src=\"http://web2.conciergeauctions.com/hubfs/2017/February%20Catalogue/%20856%20Silvertip%20Heights,%20Canmore,%20AB%20Canada/856-Silvertip-Heights,-Canmore,-AB-Canada-HeroImage-3.jpg?noresize\" width=\"798\" style=\"width:798px; padding-bottom: 50px; vertical-align: bottom;\" class=\"mcnImage heroImage\">\n" +
"                                  </a>\n" +
"                                </td>\n" +
"                              </tr>\n" +
"                            </tbody>\n" +
"                          </table>\n" +
"                        </td>\n" +
"                      </tr>\n" +
"                    </tbody>\n" +
"                  </table>\n" +
"\n" +
"                  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnTextBlock\" style=\"min-width:100%;\">\n" +
"                    <tbody class=\"mcnTextBlockOuter\">\n" +
"                      <tr>\n" +
"                        <td valign=\"top\" class=\"mcnTextBlockInner\">\n" +
"\n" +
"                          <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"min-width:100%;\" class=\"mcnTextContentContainer\">\n" +
"                            <tbody>\n" +
"                              <tr>\n" +
"                                <td valign=\"top\" class=\"mcnTextContent\" style=\"padding-top:0px; padding-right: 18px; padding-left: 18px;\">\n" +
"                                  <div style=\"text-align: center;padding-bottom:10px;\" class=\"mobileTitle\"><span style=\"font-size:30px; font-family:'Lato', sans-serif; color:rgba(0, 0, 0, .87); font-weight:700; letter-spacing: 1.75px; text-transform: uppercase;\" class=\"mobileTitle\">CANMORE, ALBERTA</span></div>\n" +
"                                  <div style=\"text-align: center;\"><span style=\"font-family:'Lato', sans-serif; font-size:18px; text-transform: uppercase;\">Previously $3.5M | Selling Without Reserve</span></div>\n" +
"                                </td>\n" +
"                              </tr>\n" +
"                            </tbody>\n" +
"                          </table>\n" +
"                        </td>\n" +
"                      </tr>\n" +
"                    </tbody>\n" +
"                  </table>\n" +
"\n" +
"                  <hr style=\"margin: 15px auto; width: 30px; border: none; height: 1px; background-color: rgba(0, 0, 0, .12);\">\n" +
"\n" +
"                </td>\n" +
"              </tr>\n" +
"              <tr>\n" +
"                <td valign=\"top\" id=\"templateBody\">\n" +
"\n" +
"                  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnTextBlock\" style=\"min-width:100%;\">\n" +
"                    <tbody class=\"mcnTextBlockOuter\">\n" +
"                      <tr>\n" +
"                        <td valign=\"top\" class=\"mcnTextBlockInner\">\n" +
"\n" +
"                          <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"min-width:100%;\" class=\"mcnTextContentContainer\">\n" +
"                            <tbody>\n" +
"                              <tr>\n" +
"                                <td valign=\"top\" class=\"mcnTextContent\" style=\"padding: 0 100px 9px;\">\n" +
"                                  <div style=\"text-align: center; padding-bottom: 10px;\"><span style=\"font-size:20px; font-family:'Lato', sans-serif; color:rgba(0, 0, 0, .87); font-weight:600; letter-spacing: 1.75px;\" class=\"mobileSubTitle\">Auction Preview Event<br>Tuesday, XXX | Noon–2 PM</span></div>\n" +
"                                  <div style=\"text-align: center; max-width: 100%;\"><span style=\"font-size:16px;color:rgba(0, 0, 0, .54);line-height:24px;font-family: 'Lato', sans-serif;\">Join us at 856 Silvertip Heights, XXX, for wine and hors d'oeuvres. Learn more about the property and the auction process.</span>\n" +
"                                    <div style=\"margin-top:35px;\">\n" +
"                                      <a href=\"http://web.conciergeauctions.com/1505-greenway-terrace-elm-grove-wisconsin-53122-rsvp\" style=\"font-family: 'Lato', sans-serif;color:#ffffff;font-size:16px;text-decoration:none;background:#ffc107;padding:10px 30px;border-radius:2px; text-transform: uppercase; box-shadow:0 1px 6px rgba(0,0,0,0.12), 0 1px 4px rgba(0,0,0,0.12)\" target=\"_blank\">reserve your spot</a>\n" +
"                                    </div>\n" +
"                                  </div>\n" +
"                                </td>\n" +
"                              </tr>\n" +
"                            </tbody>\n" +
"                          </table>\n" +
"                        </td>\n" +
"                      </tr>\n" +
"                    </tbody>\n" +
"                  </table>\n" +
"                </td>\n" +
"              </tr>\n" +
"              <tr>\n" +
"                <td valign=\"top\" id=\"templateUpperColumns\">\n" +
"                  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnTextBlock\" style=\"min-width:100%;\">\n" +
"                    <tbody class=\"mcnTextBlockOuter\">\n" +
"                      <tr>\n" +
"                        <td valign=\"top\" class=\"mcnTextBlockInner\">\n" +
"\n" +
"                          <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"min-width:100%;\" class=\"mcnTextContentContainer\">\n" +
"                            <tbody>\n" +
"                              <tr>\n" +
"                                <td align=\"center\" valign=\"top\" id=\"templateUpperColumns\">\n" +
"                          <div class=\"sectionHeaderContainer\" style=\"width: 95%; text-align: center; border-bottom: 1px solid rgba(0,0,0,.12); line-height: 0%; margin-bottom: 50px; margin-top: 75px;\">\n" +
"                            <span class=\"sectionHeader\" style=\"font-family: 'Lato', sans-serif; font-weight: 600;text-transform: uppercase; background: white; padding: 0 10px; letter-spacing: 2px; font-size: 16px;\">additional info</span>\n" +
"                          </div>\n" +
"                        </td>\n" +
"                              </tr>\n" +
"                            </tbody>\n" +
"                          </table>\n" +
"                        </td>\n" +
"                      </tr>\n" +
"                    </tbody>\n" +
"                  </table>\n" +
"\n" +
"                </td>\n" +
"              </tr>\n" +
"              <tr>\n" +
"                <td valign=\"top\" id=\"templateUpperColumns\">\n" +
"                  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"399\" class=\"columnWrapper\">\n" +
"                    <tr>\n" +
"                      <td valign=\"top\" class=\"columnContainer icon-container\" style=\"padding-left: 40%;\">\n" +
"\n" +
"                        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnImageBlock\" style=\"min-width:100%;\">\n" +
"                          <tbody class=\"mcnImageBlockOuter\">\n" +
"                            <tr>\n" +
"                              <td valign=\"top\" style=\"\" class=\"mcnImageBlockInner\">\n" +
"\n" +
"                                <table align=\"left\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"mcnImageContentContainer\" style=\"min-width:100%;\">\n" +
"                                  <tbody>\n" +
"                                    <tr>\n" +
"                                      <td class=\"mcnImageContent\" valign=\"top\" style=\"padding-top: 0; padding-bottom: 0; text-align:center;\">\n" +
"                                        <img align=\"center\" alt=\"\" src=\"http://web2.conciergeauctions.com/hubfs/2016/Rezora/ic_openHouse.png\" width=\"100\" style=\"padding-bottom: 0; vertical-align: bottom;\">\n" +
"                                      </td>\n" +
"                                    </tr>\n" +
"                                  </tbody>\n" +
"                                </table>\n" +
"                              </td>\n" +
"                            </tr>\n" +
"                          </tbody>\n" +
"                        </table>\n" +
"\n" +
"                        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnTextBlock\" style=\"min-width:100%;\">\n" +
"                          <tbody class=\"mcnTextBlockOuter\">\n" +
"                            <tr>\n" +
"                              <td valign=\"top\" class=\"mcnTextBlockInner\">\n" +
"\n" +
"                                <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"min-width:100%;\" class=\"mcnTextContentContainer\">\n" +
"                                  <tbody>\n" +
"                                    <tr>\n" +
"\n" +
"                                      <td valign=\"top\" class=\"mcnTextContent\" style=\"padding-top:15px;padding-bottom: 50px; text-align: center; text-transform: capitalize;\">\n" +
"\n" +
"                                        <span style=\"font-size:110%\"><span style=\"font-family: 'Lato', sans-serif; font-weight: 600;\">open house</span></span>\n" +
"                                        <br/>\n" +
"                                        <span style=\"font-family: 'Lato', sans-serif;\"><span style=\"font-size:100%; color: rgba(0, 0, 0, .54);\">Thurs- Sun 1–4 PM<br/>&amp; by Appointment</span></span>\n" +
"                                      </td>\n" +
"                                    </tr>\n" +
"                                  </tbody>\n" +
"                                </table>\n" +
"\n" +
"                              </td>\n" +
"                            </tr>\n" +
"                          </tbody>\n" +
"                        </table>\n" +
"                      </td>\n" +
"                    </tr>\n" +
"                  </table>\n" +
"\n" +
"                  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"399\" class=\"columnWrapper\">\n" +
"                    <tr>\n" +
"                      <td valign=\"top\" class=\"columnContainer icon-container\" style=\"padding-right: 40%;\">\n" +
"\n" +
"                        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnImageBlock\" style=\"min-width:100%;\">\n" +
"                          <tbody class=\"mcnImageBlockOuter\">\n" +
"                            <tr>\n" +
"                              <td valign=\"top\" style=\"\" class=\"mcnImageBlockInner\">\n" +
"\n" +
"                                <table align=\"left\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"mcnImageContentContainer\" style=\"min-width:100%;\">\n" +
"                                  <tbody>\n" +
"                                    <tr>\n" +
"                                      <td class=\"mcnImageContent\" valign=\"top\" style=\"padding-top:0; padding-bottom: 0; text-align: center;\">\n" +
"                                        <img align=\"center\" alt=\"\" src=\"http://web2.conciergeauctions.com/hubfs/2016/Rezora/ic_bidders.png\" width=\"100\" style=\"padding-bottom: 0; vertical-align: bottom;\">\n" +
"                                      </td>\n" +
"                                    </tr>\n" +
"                                  </tbody>\n" +
"                                </table>\n" +
"                              </td>\n" +
"                            </tr>\n" +
"                          </tbody>\n" +
"                        </table>\n" +
"\n" +
"                        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnTextBlock\" style=\"min-width:100%;\">\n" +
"                          <tbody class=\"mcnTextBlockOuter\">\n" +
"                            <tr>\n" +
"                              <td valign=\"top\" class=\"mcnTextBlockInner\">\n" +
"\n" +
"                                <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"min-width:100%;\" class=\"mcnTextContentContainer\">\n" +
"                                  <tbody>\n" +
"                                    <tr>\n" +
"                                      <td valign=\"top\" align=\"center\" class=\"mcnTextContent\" style=\"padding-top:15px; padding-bottom: 50px; padding-left:2px; text-align: center; text-transform: capitalize;\">\n" +
"                                        <span style=\"font-size:110%;\"><span style=\"font-family: 'Lato', sans-serif; font-weight: 600\">auction</span></span>\n" +
"                                        <br/>\n" +
"                                        <span style=\"font-family: 'Lato', sans-serif;\"><span style=\"font-size:100%; color: rgba(0, 0, 0, .54);\"> January 24th<br>Instant Gavel App</span></span>\n" +
"                                      </td>\n" +
"                                    </tr>\n" +
"                                  </tbody>\n" +
"                                </table>\n" +
"                              </td>\n" +
"                            </tr>\n" +
"                          </tbody>\n" +
"                        </table>\n" +
"                      </td>\n" +
"                    </tr>\n" +
"                  </table>\n" +
"                </td>\n" +
"              </tr>\n" +
"\n" +
"              <tr>\n" +
"                <td valign=\"top\" id=\"templateUpperColumns\">\n" +
"                  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnTextBlock\" style=\"min-width:100%;\">\n" +
"                    <tbody class=\"mcnTextBlockOuter\">\n" +
"                      <tr>\n" +
"                        <td valign=\"top\" class=\"mcnTextBlockInner\">\n" +
"\n" +
"                          <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"min-width:100%;\" class=\"mcnTextContentContainer\">\n" +
"                            <tbody>\n" +
"                              <tr>\n" +
"                                <td align=\"center\" valign=\"top\" id=\"templateUpperColumns\">\n" +
"                                  <div class=\"sectionHeaderContainer\" style=\"width: 95%; text-align: center; border-bottom: 1px solid rgba(0,0,0,.12); line-height: 0%; margin-bottom: 25px; margin-top: 25px;\">\n" +
"                                    <span class=\"sectionHeader\" style=\"font-family: 'Lato', sans-serif; font-weight: 600;text-transform: uppercase; background: white; padding: 0 10px; letter-spacing: 2px; font-size: 16px;\">get a closer look</span>\n" +
"                                  </div>\n" +
"                                </td>\n" +
"                              </tr>\n" +
"                            </tbody>\n" +
"                          </table>\n" +
"                        </td>\n" +
"                      </tr>\n" +
"                    </tbody>\n" +
"                  </table>\n" +
"                </td>\n" +
"              </tr>\n" +
"              <tr>\n" +
"                <td valign=\"top\" id=\"templateUpperColumns\" style=\"padding-left: 18px; padding-right: 18px;\">\n" +
"\n" +
"                  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"200\" class=\"columnWrapper\">\n" +
"                    <tr>\n" +
"                      <td valign=\"top\" class=\"columnContainer\">\n" +
"\n" +
"                        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnImageBlock\" style=\"min-width:100%;\">\n" +
"                          <tbody class=\"mcnImageBlockOuter\">\n" +
"                            <tr>\n" +
"                              <td valign=\"top\" style=\"\" class=\"mcnImageBlockInner\">\n" +
"\n" +
"                                <table align=\"left\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"mcnImageContentContainer\" style=\"min-width:100%;\">\n" +
"                                  <tbody>\n" +
"                                    <tr>\n" +
"                                      <td class=\"mcnImageContent\" valign=\"top\" style=\"padding-right:1px; padding-left:2px; padding-top: 0; padding-bottom: 0; text-align:center;\">\n" +
"                                        <a href=\"https://www.conciergeauctions.com/auctions/856-silvertip-heights-canmore-alberta\" title=\"CANMORE, ALBERTA\" class=\"\" target=\"_blank\">\n" +
"                                          <img align=\"center\" alt=\"\" src=\"http://web2.conciergeauctions.com/hubfs/2017/January%20Catalogue/856%20Silvertip%20Heights,%20Canmore,%20AB%20Canada/856-Silvertip-Heights,-Canmore,-AB-Canada-Closer-Look-2.jpg?noresize\" width=\"252\" style=\"padding-bottom: 2px; vertical-align: bottom;\" class=\"mcnImage\">\n" +
"                                        </a>\n" +
"                                      </td>\n" +
"                                    </tr>\n" +
"                                  </tbody>\n" +
"                                </table>\n" +
"                              </td>\n" +
"                            </tr>\n" +
"                          </tbody>\n" +
"                        </table>\n" +
"                      </td>\n" +
"                    </tr>\n" +
"                  </table>\n" +
"\n" +
"                  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"200\" class=\"columnWrapper\">\n" +
"                    <tr>\n" +
"                      <td valign=\"top\" class=\"columnContainer\">\n" +
"\n" +
"                        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnImageBlock\" style=\"min-width:100%;\">\n" +
"                          <tbody class=\"mcnImageBlockOuter\">\n" +
"                            <tr>\n" +
"                              <td valign=\"top\" style=\"\" class=\"mcnImageBlockInner\">\n" +
"\n" +
"                                <table align=\"left\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"mcnImageContentContainer\" style=\"min-width:100%;\">\n" +
"                                  <tbody>\n" +
"                                    <tr>\n" +
"                                      <td class=\"mcnImageContent\" valign=\"top\" style=\"padding-right:2px; padding-left:1px; padding-top: 0; padding-bottom: 0; text-align:center;\">\n" +
"                                        <a href=\"https://www.conciergeauctions.com/auctions/856-silvertip-heights-canmore-alberta\" title=\"\" class=\"\" target=\"_blank\">\n" +
"                                          <img align=\"center\" alt=\"\" src=\"http://web2.conciergeauctions.com/hubfs/2017/February%20Catalogue/%20856%20Silvertip%20Heights,%20Canmore,%20AB%20Canada/856-Silvertip-Heights,-Canmore,-AB-Canada-Closer-Look-5.jpg?noresize\" width=\"252\" style=\"padding-bottom: 2px; vertical-align: bottom;\" class=\"mcnImage\">\n" +
"                                        </a>\n" +
"                                      </td>\n" +
"                                    </tr>\n" +
"                                  </tbody>\n" +
"                                </table>\n" +
"                              </td>\n" +
"                            </tr>\n" +
"                          </tbody>\n" +
"                        </table>\n" +
"                      </td>\n" +
"                    </tr>\n" +
"                  </table>\n" +
"\n" +
"                  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"200\" class=\"columnWrapper\">\n" +
"                    <tr>\n" +
"                      <td valign=\"top\" class=\"columnContainer\">\n" +
"\n" +
"                        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnImageBlock\" style=\"min-width:100%;\">\n" +
"                          <tbody class=\"mcnImageBlockOuter\">\n" +
"                            <tr>\n" +
"                              <td valign=\"top\" style=\"\" class=\"mcnImageBlockInner\">\n" +
"\n" +
"                                <table align=\"left\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"mcnImageContentContainer\" style=\"min-width:100%;\">\n" +
"                                  <tbody>\n" +
"                                    <tr>\n" +
"                                      <td class=\"mcnImageContent\" valign=\"top\" style=\"padding-top:0; padding-bottom: 0; text-align: center;\">\n" +
"                                        <a href=\"https://www.conciergeauctions.com/auctions/856-silvertip-heights-canmore-alberta\" title=\"\" class=\"\" target=\"_blank\">\n" +
"                                          <img align=\"center\" alt=\"\" src=\"http://web2.conciergeauctions.com/hubfs/2017/January%20Catalogue/856%20Silvertip%20Heights,%20Canmore,%20AB%20Canada/856-Silvertip-Heights,-Canmore,-AB-Canada-Closer-Look-4.jpg?noresize\" width=\"252\" style=\"padding-bottom: 2px; vertical-align: bottom;\" class=\"mcnImage\">\n" +
"                                        </a>\n" +
"                                      </td>\n" +
"                                    </tr>\n" +
"                                  </tbody>\n" +
"                                </table>\n" +
"                              </td>\n" +
"                            </tr>\n" +
"                          </tbody>\n" +
"                        </table>\n" +
"                      </td>\n" +
"                    </tr>\n" +
"                  </table>\n" +
"                </td>\n" +
"              </tr>\n" +
"              <tr>\n" +
"                <td style=\"text-align: center; font-size:16px; background-color: #fff; color:rgba(0, 0, 0, .54);line-height:24px;font-family: 'Lato', sans-serif; padding: 20px 24px 40px;\">\n" +
"                  <span>Appraised at over $4 million, this contemporary estate in Canmore’s world-class Silvertip golf resort is a unique investment opportunity for a smart buyer. </span>\n" +
"                  <div style=\"margin-top:35px;\">\n" +
"                    <a href=\"https://www.conciergeauctions.com/auctions/856-silvertip-heights-canmore-alberta\" style=\"font-family: 'Lato', sans-serif;color:#ffffff;font-size:16px;text-decoration:none;background:#03a9f4;padding:10px 30px;border-radius:2px; text-transform: uppercase; box-shadow:0 1px 6px rgba(0,0,0,0.12), 0 1px 4px rgba(0,0,0,0.12)\" target=\"_blank\">explore now</a>\n" +
"                  </div>\n" +
"                </td>\n" +
"              </tr>\n" +
"            </table>\n" +
"            <tr>\n" +
"              <td valign=\"top\" id=\"templateFooter\" align=\"center\">\n" +
"                <hr style=\"margin: 10px auto 25px; max-width: 800px; border: none; height: 1px; background-color: rgba(0, 0, 0, .12);\" id=\"horizontalRule\">\n" +
"\n" +
"                <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"mcnFollowBlock\" style=\"max-width: 800px; display: inline-block;\">\n" +
"                  <tbody class=\"mcnFollowBlockOuter\">\n" +
"                    <tr>\n" +
"                      <td align=\"center\" valign=\"top\" class=\"mcnFollowBlockInner\">\n" +
"\n" +
"                        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnFollowContentContainer\">\n" +
"                          <tbody>\n" +
"                            <tr>\n" +
"                              <td>\n" +
"\n" +
"                                <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"min-width:100%;\" class=\"mcnFollowContent\">\n" +
"                                  <tbody>\n" +
"                                    <tr>\n" +
"                                      <td align=\"center\" valign=\"top\">\n" +
"                                        <div style=\"display: inline-block\">\n" +
"                                          <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
"                                            <tbody>\n" +
"                                              <tr>\n" +
"                                                <td align=\"center\" valign=\"top\" style=\"border-right: 1px solid rgba(0,0,0,.12); padding-right: 50px;\" class=\"socialPane\">\n" +
"                                                  <div style=\"text-align: center;\"><span style=\"font-size:15px; font-family: 'Lato', sans-serif; font-weight:600; letter-spacing: 1.25px; text-transform: uppercase; line-height: 22px;\"><span class=\"shortDescription\">stay in the know</span>\n" +
"                                                    <br/>follow us on social</span>\n" +
"                                                    <br/>\n" +
"                                                  </div>\n" +
"\n" +
"                                                  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\"  style=\"display:inline; padding-top: 15px;\" class=\"socialIcons\">\n" +
"                                                    <tbody>\n" +
"                                                      <tr>\n" +
"                                                        <td valign=\"top\" class=\"mcnFollowContentItemContainer\">\n" +
"\n" +
"                                                          <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnFollowContentItem\">\n" +
"                                                            <tbody>\n" +
"                                                              <tr>\n" +
"                                                                <td align=\"left\" valign=\"middle\" style=\"padding: 5px 7px;\" class=\"socialIcon\">\n" +
"\n" +
"                                                                  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
"                                                                    <tbody>\n" +
"                                                                      <tr>\n" +
"                                                                        <td align=\"center\" valign=\"middle\" width=\"30\" class=\"mcnFollowIconContent\">\n" +
"                                                                          <a href=\"http://www.facebook.com/ConciergeAuctions\" target=\"_blank\"><img src=\"https://cdn-images.mailchimp.com/icons/social-block-v2/dark-facebook-48.png\" style=\"display:block;\" width=\"30\"></a>\n" +
"                                                                        </td>\n" +
"                                                                      </tr>\n" +
"                                                                    </tbody>\n" +
"                                                                  </table>\n" +
"                                                                </td>\n" +
"                                                              </tr>\n" +
"                                                            </tbody>\n" +
"                                                          </table>\n" +
"                                                        </td>\n" +
"                                                      </tr>\n" +
"                                                    </tbody>\n" +
"                                                  </table>\n" +
"\n" +
"                                                  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"display:inline; padding-top: 15px;\" class=\"socialIcons\">\n" +
"                                                    <tbody>\n" +
"                                                      <tr>\n" +
"                                                        <td valign=\"top\" class=\"mcnFollowContentItemContainer\">\n" +
"\n" +
"                                                          <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnFollowContentItem\">\n" +
"                                                            <tbody>\n" +
"                                                              <tr>\n" +
"                                                                <td align=\"left\" valign=\"middle\" style=\"padding: 5px 7px;\" class=\"socialIcon\">\n" +
"\n" +
"                                                                  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
"                                                                    <tbody>\n" +
"                                                                      <tr>\n" +
"                                                                        <td align=\"center\" valign=\"middle\" width=\"30\" class=\"mcnFollowIconContent\">\n" +
"                                                                          <a href=\"http://www.youtube.com/user/ConciergeAuctions\" target=\"_blank\"><img src=\"https://cdn-images.mailchimp.com/icons/social-block-v2/dark-youtube-48.png\" style=\"display:block;\" width=\"30\"></a>\n" +
"                                                                        </td>\n" +
"                                                                      </tr>\n" +
"                                                                    </tbody>\n" +
"                                                                  </table>\n" +
"                                                                </td>\n" +
"                                                              </tr>\n" +
"                                                            </tbody>\n" +
"                                                          </table>\n" +
"                                                        </td>\n" +
"                                                      </tr>\n" +
"                                                    </tbody>\n" +
"                                                  </table>\n" +
"\n" +
"                                                  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"display:inline; padding-top: 15px;\" class=\"socialIcons\">\n" +
"                                                    <tbody>\n" +
"                                                      <tr>\n" +
"                                                        <td valign=\"top\" class=\"mcnFollowContentItemContainer\">\n" +
"\n" +
"                                                          <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnFollowContentItem\">\n" +
"                                                            <tbody>\n" +
"                                                              <tr>\n" +
"                                                                <td align=\"left\" valign=\"middle\" style=\"padding: 5px 7px;\" class=\"socialIcon\">\n" +
"\n" +
"                                                                  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
"                                                                    <tbody>\n" +
"                                                                      <tr>\n" +
"                                                                        <td align=\"center\" valign=\"middle\" width=\"30\" class=\"mcnFollowIconContent\">\n" +
"                                                                          <a href=\"https://plus.google.com/114233341720328809458/posts\" target=\"_blank\"><img src=\"https://cdn-images.mailchimp.com/icons/social-block-v2/dark-googleplus-48.png\" style=\"display:block;\" width=\"30\"></a>\n" +
"                                                                        </td>\n" +
"                                                                      </tr>\n" +
"                                                                    </tbody>\n" +
"                                                                  </table>\n" +
"                                                                </td>\n" +
"                                                              </tr>\n" +
"                                                            </tbody>\n" +
"                                                          </table>\n" +
"                                                        </td>\n" +
"                                                      </tr>\n" +
"                                                    </tbody>\n" +
"                                                  </table>\n" +
"\n" +
"                                                  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"display:inline; padding-top: 15px;\" class=\"socialIcons\">\n" +
"                                                    <tbody>\n" +
"                                                      <tr>\n" +
"                                                        <td valign=\"top\" class=\"mcnFollowContentItemContainer\">\n" +
"\n" +
"                                                          <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnFollowContentItem\">\n" +
"                                                            <tbody>\n" +
"                                                              <tr>\n" +
"                                                                <td align=\"left\" valign=\"middle\" style=\"padding: 5px 7px;\" class=\"socialIcon\">\n" +
"\n" +
"                                                                  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
"                                                                    <tbody>\n" +
"                                                                      <tr>\n" +
"                                                                        <td align=\"center\" valign=\"middle\" width=\"30\" class=\"mcnFollowIconContent\">\n" +
"                                                                          <a href=\"http://www.linkedin.com/company/368298\" target=\"_blank\"><img src=\"https://cdn-images.mailchimp.com/icons/social-block-v2/dark-linkedin-48.png\" style=\"display:block;\" width=\"30\"></a>\n" +
"                                                                        </td>\n" +
"                                                                      </tr>\n" +
"                                                                    </tbody>\n" +
"                                                                  </table>\n" +
"                                                                </td>\n" +
"                                                              </tr>\n" +
"                                                            </tbody>\n" +
"                                                          </table>\n" +
"                                                        </td>\n" +
"                                                      </tr>\n" +
"                                                    </tbody>\n" +
"                                                  </table>\n" +
"\n" +
"                                                  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"display:inline; padding-top: 15px;\" class=\"socialIcons\">\n" +
"                                                    <tbody>\n" +
"                                                      <tr>\n" +
"                                                        <td valign=\"top\" class=\"mcnFollowContentItemContainer\">\n" +
"\n" +
"                                                          <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnFollowContentItem\">\n" +
"                                                            <tbody>\n" +
"                                                              <tr>\n" +
"                                                                <td align=\"left\" valign=\"middle\" style=\"padding: 5px 7px;\" class=\"socialIcon\">\n" +
"\n" +
"                                                                  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
"                                                                    <tbody>\n" +
"                                                                      <tr>\n" +
"                                                                        <td align=\"center\" valign=\"middle\" width=\"30\" class=\"mcnFollowIconContent\">\n" +
"                                                                          <a href=\"http://pinterest.com/conciergeluxury/\" target=\"_blank\"><img src=\"https://cdn-images.mailchimp.com/icons/social-block-v2/dark-pinterest-48.png\" style=\"display:block;\" width=\"30\"></a>\n" +
"                                                                        </td>\n" +
"                                                                      </tr>\n" +
"                                                                    </tbody>\n" +
"                                                                  </table>\n" +
"                                                                </td>\n" +
"                                                              </tr>\n" +
"                                                            </tbody>\n" +
"                                                          </table>\n" +
"                                                        </td>\n" +
"                                                      </tr>\n" +
"                                                    </tbody>\n" +
"                                                  </table>\n" +
"\n" +
"                                                  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"display:inline; padding-top: 15px;\" class=\"socialIcons\" id=\"lastSocial\">\n" +
"                                                    <tbody>\n" +
"                                                      <tr>\n" +
"                                                        <td valign=\"top\" style=\"padding-right:0; padding-bottom:9px;\" class=\"mcnFollowContentItemContainer\">\n" +
"\n" +
"                                                          <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnFollowContentItem\">\n" +
"                                                            <tbody>\n" +
"                                                              <tr>\n" +
"                                                                <td align=\"left\" valign=\"middle\" style=\"padding: 5px 7px;\" class=\"socialIcon\">\n" +
"\n" +
"                                                                  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
"                                                                    <tbody>\n" +
"                                                                      <tr>\n" +
"                                                                        <td align=\"center\" valign=\"middle\" width=\"30\" class=\"mcnFollowIconContent\">\n" +
"                                                                          <a href=\"http://instagram.com/conciergeauctions\" target=\"_blank\"><img src=\"https://cdn-images.mailchimp.com/icons/social-block-v2/dark-instagram-48.png\" style=\"display:block;\" width=\"30\"></a>\n" +
"                                                                        </td>\n" +
"                                                                      </tr>\n" +
"                                                                    </tbody>\n" +
"                                                                  </table>\n" +
"                                                                </td>\n" +
"                                                              </tr>\n" +
"                                                            </tbody>\n" +
"                                                          </table>\n" +
"                                                        </td>\n" +
"                                                      </tr>\n" +
"                                                    </tbody>\n" +
"                                                  </table>\n" +
"                                                </td>\n" +
"                                              </tr>\n" +
"                                            </tbody>\n" +
"                                          </table>\n" +
"                                        </div>\n" +
"                                        <div style=\"display: inline-block\">\n" +
"                                          <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
"                                            <tbody>\n" +
"                                              <tr>\n" +
"                                                <td align=\"center\" valign=\"top\" style=\"padding-left: 50px;\" class=\"socialPane\">\n" +
"                                                  <div style=\"text-align: center; padding-bottom:10px;\"><span style=\"font-size:15px; font-family: 'Lato', sans-serif; font-weight:600; letter-spacing: 1.25px; text-transform: uppercase; line-height: 22px;\"><span class=\"shortDescription\">bid &amp; watch auctions live</span>\n" +
"                                                    <br/>download our <i>instant gavel</i> app</span>\n" +
"                                                    <br/>\n" +
"                                                    <a href=\"https://itunes.apple.com/us/app/instant-gavel/id979968478?mt=8\" target=\"_blank\"><img src=\"http://web2.conciergeauctions.com/hubfs/2016/Rezora/ic_appleAppStore.png\" style=\"display:inline-block; margin-right: 10px; margin-top: 18px;\" width=\"110\"></a>\n" +
"                                                    <a href=\"https://play.google.com/store/apps/details?id=com.bidwrangler.conciergeauctions\" target=\"_blank\"><img src=\"http://web2.conciergeauctions.com/hubfs/2016/Rezora/ic_googleStore.png\" style=\"display:inline-block; margin-top: 18px;\" width=\"110\"></a>\n" +
"                                                  </div>\n" +
"                                                </td>\n" +
"                                              </tr>\n" +
"                                            </tbody>\n" +
"                                          </table>\n" +
"                                        </div>\n" +
"                                      </td>\n" +
"                                    </tr>\n" +
"                                  </tbody>\n" +
"                                </table>\n" +
"                              </td>\n" +
"                            </tr>\n" +
"                          </tbody>\n" +
"                        </table>\n" +
"                      </td>\n" +
"                    </tr>\n" +
"                  </tbody>\n" +
"                </table>\n" +
"\n" +
"                <hr style=\"margin: 15px auto 25px; max-width: 800px; border: none; height: 1px; background-color: rgba(0, 0, 0, .12);\">\n" +
"\n" +
"                <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnTextBlock\" style=\"min-width:100%;\">\n" +
"                  <tbody class=\"mcnTextBlockOuter\">\n" +
"                    <tr>\n" +
"                      <td align=\"center\" valign=\"top\" class=\"mcnTextBlockInner\">\n" +
"\n" +
"                        <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"max-width: 800px;\" class=\"mcnTextContentContainer\">\n" +
"                          <tbody>\n" +
"                            <tr>\n" +
"                              <td align=\"center\" valign=\"top\" class=\"mcnTextContent\">\n" +
"                                <p id=\"footer\" style=\"font-family: Lato, Geneva, Verdana, Arial, Helvetica, sans-serif; text-align: center; font-size: 12px; line-height: 1em; display: block; padding: 0 50px 0 50px;\"><span style=\"font-size: 10px; color: rgba(0, 0, 0, .54);\">{{site_settings.company_name}}, {{site_settings.company_street_address_1}} {{site_settings.company_street_address_2}}, {{site_settings.company_city}}, {{site_settings.company_state}} {{site_settings.company_zip}} {{site_settings.company_country}} </span>\n" +
"                                  <br/>\n" +
"                                  <br/><span style=\"font-size: 10px; color: rgba(0, 0, 0, .54);\"> You received this email because you are subscribed to {{ subscription_name }} from {{site_settings.company_name}}. </span>\n" +
"                                  <br/>\n" +
"                                  <br/><span style=\"font-size: 10px; color: rgba(0, 0, 0, .54);\"> Update your <a target=\"_blank\" href=\"{{ unsubscribe_link }}\" style=\"text-decoration: underline; whitespace: nowrap; color:rgba(0, 0, 0, .54);\" data-unsubscribe=\"true\">email preferences</a> to choose the types of emails you receive. </span>\n" +
"                                  <br/>\n" +
"                                  <br/><span style=\"font-size: 10px; color: rgba(0, 0, 0, .54);\"> &nbsp;<a target=\"_blank\" href=\"{{ unsubscribe_link_all }}\" style=\"text-decoration: underline; whitespace: nowrap; color:rgba(0, 0, 0, .54);\" data-unsubscribe=\"true\">Unsubscribe from all future emails</a>&nbsp;</span><span style=\"color: rgba(0, 0, 0, .54);\">| </span><a href=\"http://web2.conciergeauctions.com/hubfs/2017/February%20Catalogue/%20856%20Silvertip%20Heights,%20Canmore,%20AB%20Canada/856-Silvertip-Heights,-Canmore,-AB-Canada-Disclaimer.jpg\" style=\"text-decoration: underline; whitespace: nowrap; font-size:10px; color:rgba(0, 0, 0, .54);\" target=\"_blank\">Disclaimer</a></p>\n" +
"                              </td>\n" +
"                            </tr>\n" +
"                          </tbody>\n" +
"                        </table>\n" +
"                      </td>\n" +
"                    </tr>\n" +
"                  </tbody>\n" +
"                </table>\n" +
"              </td>\n" +
"            </tr>\n" +
"          </table>\n" +
"        </td>\n" +
"      </tr>\n" +
"    </table>\n" +
"  </center>\n" +
"</body>\n" +
"</html>";
  
    
    
    

    
    String newhtml = html.replace("https://www.conciergeauctions.com/auctions/856-silvertip-heights-canmore-alberta",url);
    String newhtml35= newhtml.replace("Previously $3.5M | Selling Without Reserve",headline);    
    String newhtml2= newhtml35.replaceAll("CANMORE, ALBERTA",propertyname);
    String newhtml25=newhtml2.replaceAll("Canmore, Alberta",propertyname);
    String newhtml3=newhtml25.replace("856 Silvertip Heights, XXX, for wine and hors d'oeuvres",bodytext);
    String newhtml4=newhtml3.replace("Tuesday, XXX | Noon–2 PM",previewdate);
    String newhtml5=newhtml4.replaceAll("January 24th",auctiondate);
    String newhtml6=newhtml5.replace("Thurs- Sun 1–4 PM<br/>&amp; by Appointment",openhouse);
    String newhtml7=newhtml6.replace("http://web2.conciergeauctions.com/hubfs/2017/January%20Catalogue/856%20Silvertip%20Heights,%20Canmore,%20AB%20Canada/856-Silvertip-Heights,-Canmore,-AB-Canada-Closer-Look-2.jpg",img1);
    String newhtml8=newhtml7.replace("http://web2.conciergeauctions.com/hubfs/2017/February%20Catalogue/%20856%20Silvertip%20Heights,%20Canmore,%20AB%20Canada/856-Silvertip-Heights,-Canmore,-AB-Canada-Closer-Look-5.jpg",img2);
    String newhtml9=newhtml8.replace("http://web2.conciergeauctions.com/hubfs/2017/January%20Catalogue/856%20Silvertip%20Heights,%20Canmore,%20AB%20Canada/856-Silvertip-Heights,-Canmore,-AB-Canada-Closer-Look-4.jpg",img3);
    String newhtml10=newhtml9.replace("Appraised at over $4 million, this contemporary estate in Canmore’s world-class Silvertip golf resort is a unique investment opportunity for a smart buyer. ",bodytext2);
    String newhtml11=newhtml10.replace("http://web2.conciergeauctions.com/hubfs/2017/February%20Catalogue/%20856%20Silvertip%20Heights,%20Canmore,%20AB%20Canada/856-Silvertip-Heights,-Canmore,-AB-Canada-HeroImage-3.jpg",heroimage);
    String newhtml12=newhtml11.replace("http://web.conciergeauctions.com/1505-greenway-terrace-elm-grove-wisconsin-53122-rsvp",rsvplink);
    String newhtml13=newhtml12;
    
    String finalhtml=newhtml13.replace("http://web2.conciergeauctions.com/hubfs/2017/February%20Catalogue/%20856%20Silvertip%20Heights,%20Canmore,%20AB%20Canada/856-Silvertip-Heights,-Canmore,-AB-Canada-Disclaimer.jpg",disclamier);    


return finalhtml;
   // do something
}
 
   public static String returnlaunchemailhtml(String[] args) {
       String propertyname=args[0];    
         
         String bodytext=args[1]; //title
         
         String URL=args[2];
          
         String disclamier=args[3];
        
         String img1url=args[4];
         
         String img2url=args[5];
         
         String img3url= args[6];
        
         String herourl=args[7];
         
         String auctiondate= args[8];
         
         String previewdate= args[9];
         
         String previewtime = args [10];
         
         String openhouse=args[11];
         
         String sellingprice = args[12];
         
        
       
      String html="	<!doctype html>\n" +
"	<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\">\n" +
"\n" +
"	<head>\n" +
"	  <!-- NAME: 1:3:2 COLUMN -->\n" +
"	  <!--[if gte mso 15]>\n" +
"			<xml>\n" +
"				<o:OfficeDocumentSettings>\n" +
"				<o:AllowPNG/>\n" +
"				<o:PixelsPerInch>96</o:PixelsPerInch>\n" +
"				</o:OfficeDocumentSettings>\n" +
"			</xml>\n" +
"			<![endif]-->\n" +
"	  <meta charset=\"UTF-8\">\n" +
"	  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
"	  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
"	  <title>*|MC:SUBJECT|*</title>\n" +
"	  <!-- Added by Hubspot 3/2/16 -->\n" +
"	  <!-- Preview text (text which appears right after subject) -->\n" +
"	  <div id=\"preview_text\" style=\"display:none!important\">\n" +
"		{% text \"preview_text\" label=\"Preview Text <span class=help-text>This will be used as the preview text that displays in some email clients</span>\", value=\"\", no_wrapper=True %}\n" +
"	  </div>\n" +
"\n" +
"	  <link href='https://fonts.googleapis.com/css?family=Lato:400,700,900' rel='stylesheet' type='text/css'>\n" +
"	  <!-- font-family: 'Lato', sans-serif; -->\n" +
"	  <style type=\"text/css\">\n" +
"		p {\n" +
"		  margin: 10px 0;\n" +
"		  padding: 0;\n" +
"		}\n" +
"\n" +
"		table {\n" +
"		  border-collapse: collapse;\n" +
"		}\n" +
"		/*Added by Hubspot 3/2/16*/\n" +
"		/* Hide preview text on rendering */\n" +
"\n" +
"		#preview_text {\n" +
"		  display: none;\n" +
"		}\n" +
"\n" +
"		img,\n" +
"		a img {\n" +
"		  border: 0;\n" +
"		  height: auto;\n" +
"		  outline: none;\n" +
"		  text-decoration: none;\n" +
"		}\n" +
"\n" +
"		body,\n" +
"		#bodyTable,\n" +
"		#bodyCell {\n" +
"		  height: 100%;\n" +
"		  margin: 0;\n" +
"		  padding: 0;\n" +
"		  width: 100%;\n" +
"		}\n" +
"\n" +
"		img {\n" +
"		  -ms-interpolation-mode: bicubic;\n" +
"		}\n" +
"\n" +
"		table {\n" +
"		  mso-table-lspace: 0pt;\n" +
"		  mso-table-rspace: 0pt;\n" +
"		}\n" +
"\n" +
"		p,\n" +
"		a,\n" +
"		li,\n" +
"		td,\n" +
"		blockquote {\n" +
"		  mso-line-height-rule: exactly;\n" +
"		}\n" +
"\n" +
"		a[href^=tel],\n" +
"		a[href^=sms] {\n" +
"		  color: inherit;\n" +
"		  cursor: default;\n" +
"		  text-decoration: none;\n" +
"		}\n" +
"\n" +
"		p,\n" +
"		a,\n" +
"		li,\n" +
"		td,\n" +
"		body,\n" +
"		table,\n" +
"		blockquote {\n" +
"		  -ms-text-size-adjust: 100%;\n" +
"		  -webkit-text-size-adjust: 100%;\n" +
"		}\n" +
"\n" +
"		a[x-apple-data-detectors] {\n" +
"		  color: inherit !important;\n" +
"		  text-decoration: none !important;\n" +
"		  font-size: inherit !important;\n" +
"		  font-family: inherit !important;\n" +
"		  font-weight: inherit !important;\n" +
"		  line-height: inherit !important;\n" +
"		}\n" +
"\n" +
"		#bodyCell {\n" +
"		  padding: 10px;\n" +
"		}\n" +
"\n" +
"		a.mcnButton {\n" +
"		  display: block;\n" +
"		}\n" +
"\n" +
"		.mcnImage {\n" +
"		  vertical-align: bottom;\n" +
"		}\n" +
"\n" +
"		.mcnTextContent {\n" +
"		  word-break: break-word;\n" +
"		}\n" +
"\n" +
"		.mcnTextContent img {\n" +
"		  height: auto !important;\n" +
"		}\n" +
"\n" +
"		body,\n" +
"		#bodyTable {\n" +
"		  background-color: #f9f9f9;\n" +
"		  color: rgba(0, 0, 0, .87);\n" +
"		}\n" +
"\n" +
"		#bodyCell {\n" +
"		  border-top: 0;\n" +
"		}\n" +
"\n" +
"		.templateContainer {\n" +
"		  border: 0;\n" +
"		}\n" +
"\n" +
"		#templatePreheader {\n" +
"		  background-color: #F9F9F9;\n" +
"		  border-top: 0;\n" +
"		  border-bottom: 0;\n" +
"		  padding-top: 0px;\n" +
"		  padding-bottom: 0px;\n" +
"		}\n" +
"\n" +
"		#templatePreheader .mcnTextContent,\n" +
"		#templatePreheader .mcnTextContent p {\n" +
"		  color: rgba(0, 0, 0, .87);\n" +
"		  font-family: lato;\n" +
"		  font-size: 12px;\n" +
"		  line-height: 150%;\n" +
"		  text-align: left;\n" +
"		}\n" +
"\n" +
"		#templatePreheader .mcnTextContent a,\n" +
"		#templatePreheader .mcnTextContent p a {\n" +
"		  color: rgba(0, 0, 0, .87);\n" +
"		  font-weight: normal;\n" +
"		  text-decoration: underline;\n" +
"		}\n" +
"\n" +
"		#templateHeader {\n" +
"		  background-color: #FFFFFF;\n" +
"		  border-top: 0;\n" +
"		  border-bottom: 0;\n" +
"		  padding-top: 30px;\n" +
"		  padding-bottom: 0;\n" +
"		}\n" +
"\n" +
"		#templateHeader .mcnTextContent,\n" +
"		#templateHeader .mcnTextContent p {\n" +
"		  color: rgba(0, 0, 0, .87);\n" +
"		  font-family: lato;\n" +
"		  font-size: 16px;\n" +
"		  line-height: 150%;\n" +
"		  text-align: left;\n" +
"		}\n" +
"\n" +
"		#templateHeader .mcnTextContent a,\n" +
"		#templateHeader .mcnTextContent p a {\n" +
"		  font-weight: normal;\n" +
"		  text-decoration: underline;\n" +
"		}\n" +
"\n" +
"		#templateBody {\n" +
"		  background-color: #FFFFFF;\n" +
"		  border-top: 0;\n" +
"		  border-bottom: 0;\n" +
"		  padding-top: 0;\n" +
"		  padding-bottom: 0;\n" +
"		}\n" +
"\n" +
"		#templateBody .mcnTextContent,\n" +
"		#templateBody .mcnTextContent p {\n" +
"		  color: rgba(0, 0, 0, .87);\n" +
"		  font-family: lato;\n" +
"		  font-size: 16px;\n" +
"		  line-height: 150%;\n" +
"		  text-align: left;\n" +
"		}\n" +
"\n" +
"		#templateBody .mcnTextContent a,\n" +
"		#templateBody .mcnTextContent p a {\n" +
"		  font-weight: normal;\n" +
"		  text-decoration: underline;\n" +
"		}\n" +
"\n" +
"		#templateUpperColumns {\n" +
"		  background-color: #FFFFFF;\n" +
"		  border-top: 0;\n" +
"		  border-bottom: 0;\n" +
"		  padding-top: 0;\n" +
"		  padding-bottom: 0;\n" +
"		}\n" +
"\n" +
"		#templateUpperColumns .columnContainer .mcnTextContent,\n" +
"		#templateUpperColumns .columnContainer .mcnTextContent p {\n" +
"		  color: rgba(0, 0, 0, .87);\n" +
"		  font-family: lato;\n" +
"		  font-size: 16px;\n" +
"		  line-height: 150%;\n" +
"		  text-align: center;\n" +
"		}\n" +
"\n" +
"		#templateUpperColumns .columnContainer .mcnTextContent a,\n" +
"		#templateUpperColumns .columnContainer .mcnTextContent p a {\n" +
"		  font-weight: normal;\n" +
"		  text-decoration: underline;\n" +
"		}\n" +
"\n" +
"		#templateLowerColumns {\n" +
"		  background-color: #FFFFFF;\n" +
"		  border-top: 0;\n" +
"		  padding-top: 0;\n" +
"		  padding-bottom: 0px;\n" +
"		}\n" +
"\n" +
"		#templateLowerColumns .columnContainer .mcnTextContent,\n" +
"		#templateLowerColumns .columnContainer .mcnTextContent p {\n" +
"		  color: rgba(0, 0, 0, .87);\n" +
"		  font-family: lato;\n" +
"		  font-size: 16px;\n" +
"		  line-height: 150%;\n" +
"		  text-align: left;\n" +
"		}\n" +
"\n" +
"		#templateLowerColumns .columnContainer .mcnTextContent a,\n" +
"		#templateLowerColumns .columnContainer .mcnTextContent p a {\n" +
"		  font-weight: normal;\n" +
"		  text-decoration: underline;\n" +
"		}\n" +
"\n" +
"		#templateFooter {\n" +
"		  background-color: #FAFAFA;\n" +
"		  border-top: 0;\n" +
"		  border-bottom: 0;\n" +
"		  padding-top: 9px;\n" +
"		  padding-bottom: 9px;\n" +
"		}\n" +
"\n" +
"		#templateFooter .mcnTextContent,\n" +
"		#templateFooter .mcnTextContent p {\n" +
"		  color: rgba(0, 0, 0, .87);\n" +
"		  font-family: lato;\n" +
"		  font-size: 12px;\n" +
"		  line-height: 150%;\n" +
"		  text-align: center;\n" +
"		}\n" +
"\n" +
"		#templateFooter .mcnTextContent a,\n" +
"		#templateFooter .mcnTextContent p a {\n" +
"		  color: rgba(0, 0, 0, .87);\n" +
"		  font-weight: normal;\n" +
"		  text-decoration: underline;\n" +
"		}\n" +
"\n" +
"		@media only screen and (max-width: 480px) {\n" +
"		  body,\n" +
"		  table,\n" +
"		  td,\n" +
"		  p,\n" +
"		  a,\n" +
"		  li,\n" +
"		  blockquote {\n" +
"			-webkit-text-size-adjust: none !important;\n" +
"		  }\n" +
"		}\n" +
"\n" +
"		@media only screen and (max-width: 480px) {\n" +
"		  f\n" +
"		}\n" +
"\n" +
"		@media only screen and (max-width: 480px) {\n" +
"		  #bodyCell {\n" +
"			padding-top: 10px !important;\n" +
"		  }\n" +
"		}\n" +
"\n" +
"		@media only screen and (max-width: 480px) {\n" +
"		  .columnWrapper {\n" +
"			max-width: 100% !important;\n" +
"			width: 100% !important;\n" +
"		  }\n" +
"		}\n" +
"\n" +
"		@media only screen and (max-width: 480px) {\n" +
"		  .mcnImage {\n" +
"			width: 95% !important;\n" +
"		  }\n" +
"		}\n" +
"\n" +
"		@media only screen and (max-width: 480px) {\n" +
"		  .mobileTitle {\n" +
"			font-size: 28px !important;\n" +
"			padding-bottom: 10px !important;\n" +
"			line-height: 35px;\n" +
"		  }\n" +
"		}\n" +
"\n" +
"		@media only screen and (max-width: 480px) {\n" +
"		  .menu-container {\n" +
"			padding-top: 10px !important;\n" +
"			padding-bottom: 10px !important;\n" +
"		  }\n" +
"		}\n" +
"\n" +
"		@media only screen and (max-width: 374px) and (min-width: 320px) {\n" +
"		  .menu-items {\n" +
"			font-size: 10px !important;\n" +
"		  }\n" +
"		}\n" +
"\n" +
"		@media only screen and (max-width: 480px) and (min-width: 375px) {\n" +
"		  .menu-items {\n" +
"			font-size: 12px !important;\n" +
"		  }\n" +
"		}\n" +
"\n" +
"		@media only screen and (max-width: 480px) {\n" +
"		  .menu-item {\n" +
"			padding-right: 10px !important;\n" +
"		  }\n" +
"		}\n" +
"\n" +
"		@media only screen and (max-width: 480px) {\n" +
"		  .mobileCatalogText {\n" +
"			padding-left: 0px !important;\n" +
"			padding-right: 0px !important;\n" +
"		  }\n" +
"		}\n" +
"\n" +
"		@media only screen and (max-width: 480px) {\n" +
"		  .companyLogo {\n" +
"			width: 250px !important;\n" +
"		  }\n" +
"		}\n" +
"\n" +
"		@media only screen and (max-width: 480px) {\n" +
"		  .mcnCaptionTopContent,\n" +
"		  .mcnTextContentContainer,\n" +
"		  .mcnBoxedTextContentContainer {\n" +
"			max-width: 100% !important;\n" +
"			width: 100% !important;\n" +
"		  }\n" +
"		}\n" +
"\n" +
"		@media only screen and (max-width: 480px) {\n" +
"		  .mcnImageBlockInner,\n" +
"		  .mcnImageContent {\n" +
"			padding: 0px 6px !important;\n" +
"		  }\n" +
"		}\n" +
"\n" +
"		@media only screen and (max-width: 480px) {\n" +
"		  .mcnTextContent {\n" +
"			padding-right: 24px !important;\n" +
"			padding-left: 24px !important;\n" +
"		  }\n" +
"		}\n" +
"\n" +
"		@media only screen and (max-width: 480px) {\n" +
"		  .mobileHeader {\n" +
"			padding: 0 !important;\n" +
"		  }\n" +
"		}\n" +
"\n" +
"		@media only screen and (max-width: 480px) {\n" +
"		  .mcnBoxedTextContentContainer {\n" +
"			min-width: 100% !important;\n" +
"		  }\n" +
"		}\n" +
"\n" +
"		@media only screen and (max-width: 480px) {\n" +
"		  .mcnImageGroupContent {\n" +
"			padding: 9px !important;\n" +
"		  }\n" +
"		}\n" +
"\n" +
"		@media only screen and (max-width: 480px) {\n" +
"		  .mcnCaptionLeftContentOuter .mcnTextContent,\n" +
"		  .mcnCaptionRightContentOuter .mcnTextContent {\n" +
"			padding-top: 9px !important;\n" +
"		  }\n" +
"		}\n" +
"\n" +
"		@media only screen and (max-width: 480px) {\n" +
"		  .mcnImageCardTopImageContent,\n" +
"		  .mcnCaptionBlockInner .mcnCaptionTopContent:last-child .mcnTextContent {\n" +
"			padding-top: 18px !important;\n" +
"		  }\n" +
"		}\n" +
"\n" +
"		@media only screen and (max-width: 480px) {\n" +
"		  .mcnImageCardBottomImageContent {\n" +
"			padding-bottom: 9px !important;\n" +
"		  }\n" +
"		}\n" +
"\n" +
"		@media only screen and (max-width: 480px) {\n" +
"		  .mcnImageGroupBlockInner {\n" +
"			padding-top: 0 !important;\n" +
"			padding-bottom: 0 !important;\n" +
"		  }\n" +
"		}\n" +
"\n" +
"		@media only screen and (max-width: 480px) {\n" +
"		  .mcnImageGroupBlockOuter {\n" +
"			padding-top: 9px !important;\n" +
"			padding-bottom: 9px !important;\n" +
"		  }\n" +
"		}\n" +
"\n" +
"		@media only screen and (max-width: 480px) {\n" +
"		  .mcnImageCardLeftImageContent,\n" +
"		  .mcnImageCardRightImageContent {\n" +
"			padding-right: 18px !important;\n" +
"			padding-bottom: 0 !important;\n" +
"			padding-left: 18px !important;\n" +
"		  }\n" +
"		}\n" +
"\n" +
"		@media only screen and (max-width: 480px) {\n" +
"		  .mcpreview-image-uploader {\n" +
"			display: none !important;\n" +
"			width: 100% !important;\n" +
"		  }\n" +
"		}\n" +
"\n" +
"		@media only screen and (max-width: 480px) {\n" +
"		  .mcnBoxedTextContentContainer .mcnTextContent,\n" +
"		  .mcnBoxedTextContentContainer .mcnTextContent p {\n" +
"			font-size: 14px !important;\n" +
"			line-height: 150% !important;\n" +
"		  }\n" +
"		}\n" +
"\n" +
"		@media only screen and (max-width: 480px) {\n" +
"		  #templatePreheader {\n" +
"			display: block !important;\n" +
"		  }\n" +
"		}\n" +
"\n" +
"		@media only screen and (max-width: 480px) {\n" +
"		  #templatePreheader .mcnTextContent,\n" +
"		  #templatePreheader .mcnTextContent p {\n" +
"			font-size: 14px !important;\n" +
"			line-height: 150% !important;\n" +
"		  }\n" +
"		}\n" +
"\n" +
"		@media only screen and (max-width: 480px) {\n" +
"		  #templateHeader .mcnTextContent,\n" +
"		  #templateHeader .mcnTextContent p {\n" +
"			font-size: 16px !important;\n" +
"			line-height: 150% !important;\n" +
"		  }\n" +
"		}\n" +
"\n" +
"		@media only screen and (max-width: 480px) {\n" +
"		  #templateBody .mcnTextContent,\n" +
"		  #templateBody .mcnTextContent p {\n" +
"			font-size: 16px !important;\n" +
"			line-height: 150% !important;\n" +
"		  }\n" +
"		}\n" +
"\n" +
"		@media only screen and (max-width: 480px) {\n" +
"		  #templateUpperColumns .columnContainer .mcnTextContent,\n" +
"		  #templateUpperColumns .columnContainer .mcnTextContent p {\n" +
"			font-size: 16px !important;\n" +
"			line-height: 150% !important;\n" +
"		  }\n" +
"		}\n" +
"\n" +
"		@media only screen and (max-width: 480px) {\n" +
"		  #templateLowerColumns .columnContainer .mcnTextContent,\n" +
"		  #templateLowerColumns .columnContainer .mcnTextContent p {\n" +
"			font-size: 16px !important;\n" +
"			line-height: 150% !important;\n" +
"		  }\n" +
"		}\n" +
"\n" +
"		@media only screen and (max-width: 480px) {\n" +
"		  #templateFooter .mcnTextContent,\n" +
"		  #templateFooter .mcnTextContent p {\n" +
"			font-size: 14px !important;\n" +
"			line-height: 125% !important;\n" +
"		  }\n" +
"		}\n" +
"\n" +
"		.mobileHeader {\n" +
"		  min-width: 798px !important;\n" +
"		}\n" +
"\n" +
"		@media only screen and (max-width: 480px) {\n" +
"		  .mobileHeader {\n" +
"			min-width: 0 !important;\n" +
"		  }\n" +
"		}\n" +
"\n" +
"		@media only screen and (max-width: 480px) {\n" +
"		  .socialPane {\n" +
"			border-right: none !important;\n" +
"			padding-right: 0 !important;\n" +
"			padding-left: 0 !important;\n" +
"		  }\n" +
"		  .mcnFollowContentItemContainer {\n" +
"			padding-bottom: 10px !important;\n" +
"		  }\n" +
"		  #lastSocial {\n" +
"			padding-right: 0 !important;\n" +
"		  }\n" +
"		  .shortDescription {\n" +
"			display: none !important;\n" +
"		  }\n" +
"		  .socialIcons {\n" +
"			padding-top: 14px !important;\n" +
"		  }\n" +
"		  #horizontalRule {\n" +
"			margin-bottom: 15px !important;\n" +
"		  }\n" +
"		  .icon-container {\n" +
"			padding-right: 0 !important;\n" +
"			padding-left: 0 !important;\n" +
"		  }\n" +
"		  .sectionHeaderContainer {\n" +
"			width: 90% !important;\n" +
"		  }\n" +
"		}\n" +
"	  </style>\n" +
"	</head>\n" +
"\n" +
"	<body>\n" +
"	  <div style=\"display:none; white-space:nowrap; font:15px courier; line-height:0;\">\n" +
"		&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; \n" +
"		&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; \n" +
"		&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;\n" +
"	  </div>\n" +
"	  <center>\n" +
"\n" +
"		<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" height=\"100%\" width=\"100%\" id=\"bodyTable\">\n" +
"		  <tr>\n" +
"			<td align=\"center\" valign=\"top\" id=\"bodyCell\">\n" +
"\n" +
"			  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"templateContainer\">\n" +
"				<tr>\n" +
"				  <td valign=\"top\" id=\"templatePreheader\">\n" +
"\n" +
"					<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnTextBlock\" style=\"max-width:800px; margin: 0 auto;\">\n" +
"					  <tbody class=\"mcnTextBlockOuter\">\n" +
"						<tr>\n" +
"						  <td valign=\"top\" class=\"mcnTextBlockInner\">\n" +
"\n" +
"							<table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"282\" class=\"mcnTextContentContainer\">\n" +
"							  <tbody>\n" +
"								<tr>\n" +
"								  <td valign=\"top\" class=\"mcnTextContent\" style=\"padding-top:9px; padding-left:18px; padding-bottom:9px; padding-right:0;\">\n" +
"								  </td>\n" +
"								</tr>\n" +
"							  </tbody>\n" +
"							</table>\n" +
"\n" +
"							<table align=\"right\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"282\" class=\"mcnTextContentContainer\">\n" +
"							  <tbody>\n" +
"								<tr>\n" +
"								  <td valign=\"top\" class=\"mcnTextContent\" style=\"padding-top:9px; padding-right:18px; padding-bottom:9px; padding-left:18px;\">\n" +
"									{%if content.create_page%} <div style=\"text-align: right;\"><span style=\"font-size:10px;font-family: 'Lato', sans-serif;color:rgba(0, 0, 0, .87);\">\n" +
"									  <a href=\"{{view_as_page_url}}\" target=\"_blank\">\n" +
"													 <span style=\"color:rgba(0, 0, 0, .87)\">View in browser</span>{%endif%}\n" +
"									  </a>\n" +
"									  </span>\n" +
"									</div>\n" +
"								  </td>\n" +
"								</tr>\n" +
"							  </tbody>\n" +
"							</table>\n" +
"						  </td>\n" +
"						</tr>\n" +
"					  </tbody>\n" +
"					</table>\n" +
"				  </td>\n" +
"				</tr>\n" +
"				<table style=\"max-width: 800px; box-shadow: 0 1px 6px rgba(0,0,0,0.12), 0 1px 4px rgba(0,0,0,0.12); display: inline-block;\">\n" +
"				  <tr>\n" +
"					<td valign=\"top\" id=\"templateHeader\">\n" +
"					  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnImageBlock\" style=\"min-width:100%;\">\n" +
"						<tbody class=\"mcnImageBlockOuter\">\n" +
"						  <tr>\n" +
"							<td valign=\"top\" style=\"padding:10px 0 0;\" class=\"mcnImageBlockInner heroContainer\">\n" +
"\n" +
"							  <table align=\"left\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"mcnImageContentContainer\" style=\"min-width:100%;\">\n" +
"								<tbody>\n" +
"								  <tr>\n" +
"									<td class=\"mcnImageContent\" valign=\"top\" style=\"padding-right: 0px; padding-left: 0px; padding-top: 0; padding-bottom: 10px; text-align:center;\">\n" +
"									  <a href=\"https://www.conciergeauctions.com\" target=\"_blank\" data-hs-link-id=\"0\">\n" +
"										<img align=\"center\" alt=\"\" src=\"https://cdn2.hubspot.net/hub/114319/hubfs/Logos/CA-logo-header-2.jpg?noresize\" width=\"369\" style=\"width:369; margin-bottom: 20px; display: inline !important; vertical-align: bottom;\" class=\"mcnImage companyLogo\">\n" +
"									  </a>\n" +
"									</td>\n" +
"								  </tr>\n" +
"								</tbody>\n" +
"							  </table>\n" +
"							</td>\n" +
"						  </tr>\n" +
"						</tbody>\n" +
"					  </table>\n" +
"\n" +
"					  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnTextBlock\" style=\"min-width:100%;\">\n" +
"						<tbody class=\"mcnTextBlockOuter\">\n" +
"						  <tr>\n" +
"							<td valign=\"top\" class=\"mcnTextBlockInner\">\n" +
"\n" +
"							  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"min-width:100%;\" class=\"mcnTextContentContainer\">\n" +
"								<tbody>\n" +
"								  <tr>\n" +
"									<td align=\"center\" valign=\"top\" id=\"templateUpperColumns\">\n" +
"									  <div class=\"sectionHeaderContainer\" style=\"width: 95%; text-align: center; border-bottom: 1px solid rgba(0,0,0,.12); line-height: 0%; margin-bottom: 25px; margin-top: 25px;\">\n" +
"										<span class=\"sectionHeader\" style=\"font-family: 'Lato', sans-serif; font-weight: 600;text-transform: uppercase; background: white; padding: 0 10px; letter-spacing: 2px; font-size: 16px;\">Auction february 9</span>\n" +
"									  </div>\n" +
"									</td>\n" +
"								  </tr>\n" +
"								</tbody>\n" +
"							  </table>\n" +
"							</td>\n" +
"						  </tr>\n" +
"						</tbody>\n" +
"					  </table>\n" +
"\n" +
"					  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnImageBlock\" style=\"min-width:100%;\">\n" +
"						<tbody class=\"mcnImageBlockOuter\">\n" +
"						  <tr>\n" +
"							<td valign=\"top\" style=\"\" class=\"mcnImageBlockInner mobileHeader\">\n" +
"\n" +
"							  <table align=\"left\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"mcnImageContentContainer\" style=\"min-width:100%;\">\n" +
"								<tbody>\n" +
"								  <tr>\n" +
"									<td class=\"mcnImageContent mobileHeader\" valign=\"top\" style=\"padding-top: 0; padding-bottom: 0; text-align:center;\">\n" +
"									  <a href=\"https://www.conciergeauctions.com/auctions/856-silvertip-heights-canmore-alberta\" title=\"CANMORE, ALBERTA\" class=\"\" target=\"_blank\">\n" +
"										<img align=\"center\" alt=\"CANMORE, ALBERTA\" src=\"http://web2.conciergeauctions.com/hubfs/2017/January%20Catalogue/856%20Silvertip%20Heights,%20Canmore,%20AB%20Canada/856-Silvertip-Heights,-Canmore,-AB-Canada-HeroImage-2.jpg?noresize\" width=\"798\" style=\"width:798px; padding-bottom: 50px; vertical-align: bottom;\" class=\"mcnImage heroImage\">\n" +
"									  </a>\n" +
"									</td>\n" +
"								  </tr>\n" +
"								</tbody>\n" +
"							  </table>\n" +
"							</td>\n" +
"						  </tr>\n" +
"						</tbody>\n" +
"					  </table>\n" +
"\n" +
"					  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnTextBlock\" style=\"min-width:100%;\">\n" +
"						<tbody class=\"mcnTextBlockOuter\">\n" +
"						  <tr>\n" +
"							<td valign=\"top\" class=\"mcnTextBlockInner\">\n" +
"\n" +
"							  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"min-width:100%;\" class=\"mcnTextContentContainer\">\n" +
"								<tbody>\n" +
"								  <tr>\n" +
"									<td valign=\"top\" class=\"mcnTextContent\" style=\"padding-top:0px; padding-right: 18px; padding-left: 18px;\">\n" +
"									  <div style=\"text-align: center;padding-bottom:10px;\" class=\"mobileTitle\"><span style=\"font-size:30px; font-family:'Lato', sans-serif; color:rgba(0, 0, 0, .87); font-weight:800; letter-spacing: 1.75px; text-transform: uppercase;\" class=\"mobileTitle\">CANMORE, ALBERTA\n" +
"\n" +
"	</span></div>\n" +
"									  <div style=\"text-align: center;\"><span style=\"font-family:'Lato', sans-serif; font-size:18px; text-transform: uppercase;\">FEBRUARY 9th</span></div>\n" +
"\n" +
"									</td>\n" +
"								  </tr>\n" +
"								</tbody>\n" +
"							  </table>\n" +
"							</td>\n" +
"						  </tr>\n" +
"						</tbody>\n" +
"					  </table>\n" +
"\n" +
"					  <hr style=\"margin: 15px auto; width: 30px; border: none; height: 1px; background-color: rgba(0, 0, 0, .12);\">\n" +
"\n" +
"					</td>\n" +
"				  </tr>\n" +
"				  <tr>\n" +
"					<td valign=\"top\" id=\"templateBody\">\n" +
"\n" +
"					  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnTextBlock\" style=\"min-width:100%;\">\n" +
"						<tbody class=\"mcnTextBlockOuter\">\n" +
"						  <tr>\n" +
"							<td valign=\"top\" class=\"mcnTextBlockInner\"> \n" +
"\n" +
"							  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"min-width:100%;\" class=\"mcnTextContentContainer\">\n" +
"								<tbody>\n" +
"								  <tr>\n" +
"									<td valign=\"top\" class=\"mcnTextContent\" style=\"padding: 0 100px 9px;\">\n" +
"\n" +
"										<div style=\"text-align: center; padding-bottom: 10px;\"><span style=\"font-size:20px; font-family:'Lato', sans-serif; color:rgba(0, 0, 0, .87); font-weight:600; letter-spacing: 1.75px;\" class=\"mobileSubTitle\">	\n" +
"	Previously $3.5M | Selling Without Reserve</span></div>\n" +
"									  <div style=\"text-align: center; max-width: 100%;\"><span style=\"font-size:16px;color:rgba(0, 0, 0, .54);line-height:24px;font-family: 'Lato', sans-serif;\">\n" +
"	Appraised at over $4 million, this contemporary estate in Canmore’s world-class Silvertip golf resort is a unique investment opportunity for a smart buyer. \n" +
"\n" +
"	 <br><br><i>\n" +
"										  Bid via Instant Gavel</i></span>                   <br><br>\n" +
"									  <div style=\"margin-top:35px;\">\n" +
"									   <a href=\"https://www.conciergeauctions.com/auctions/856-silvertip-heights-canmore-alberta\" style=\"font-family: 'Lato', sans-serif;color:#ffffff;font-size:16px;text-decoration:none;background:#ffc107;padding:10px 30px;border-radius:2px; text-transform: uppercase; box-shadow:0 1px 6px rgba(0,0,0,0.12), 0 1px 4px rgba(0,0,0,0.12)\" target=\"_blank\">explore now</a>\n" +
"									  </div>\n" +
"									  </div>\n" +
"									</td>\n" +
"								  </tr>\n" +
"								</tbody>\n" +
"							  </table>\n" +
"							</td>\n" +
"						  </tr>\n" +
"						</tbody>\n" +
"					  </table>\n" +
"					</td>\n" +
"				  </tr>\n" +
"				  <tr>\n" +
"					<td valign=\"top\" id=\"templateUpperColumns\">\n" +
"					  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnTextBlock\" style=\"min-width:100%;\">\n" +
"						<tbody class=\"mcnTextBlockOuter\">\n" +
"						  <tr>\n" +
"							<td valign=\"top\" class=\"mcnTextBlockInner\">\n" +
"\n" +
"							  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"min-width:100%;\" class=\"mcnTextContentContainer\">\n" +
"								<tbody>\n" +
"								  <tr>\n" +
"									<td align=\"center\" valign=\"top\" id=\"templateUpperColumns\">\n" +
"									  <div class=\"sectionHeaderContainer\" style=\"width: 95%; text-align: center; border-bottom: 1px solid rgba(0,0,0,.12); line-height: 0%; margin-bottom: 50px; margin-top: 25px; padding-top: 75px;\">\n" +
"										<span class=\"sectionHeader\" style=\"font-family: 'Lato', sans-serif; font-weight: 600;text-transform: uppercase; background: white; padding: 0 10px; letter-spacing: 2px; font-size: 16px;\">you're invited</span>\n" +
"									  </div>\n" +
"									</td>\n" +
"								  </tr>\n" +
"								</tbody>\n" +
"							  </table>\n" +
"							</td>\n" +
"						  </tr>\n" +
"						</tbody>\n" +
"					  </table>\n" +
"\n" +
"					</td>\n" +
"				  </tr>\n" +
"				  <tr>\n" +
"						<td valign=\"top\" id=\"templateUpperColumns\">\n" +
"						  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"266\" class=\"columnWrapper\">\n" +
"							<tbody><tr>\n" +
"							  <td valign=\"top\" class=\"columnContainer\">\n" +
"\n" +
"								<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnImageBlock\" style=\"min-width:100%;\">\n" +
"								  <tbody class=\"mcnImageBlockOuter\">\n" +
"									<tr>\n" +
"									  <td valign=\"top\" style=\"\" class=\"mcnImageBlockInner\">\n" +
"\n" +
"										<table align=\"left\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"mcnImageContentContainer\" style=\"min-width:100%;\">\n" +
"										  <tbody>\n" +
"											<tr>\n" +
"											  <td class=\"mcnImageContent\" valign=\"top\" style=\"padding-top: 0; padding-bottom: 0; text-align:center;\">\n" +
"												<img align=\"center\" alt=\"\" src=\"https://cdn2.hubspot.net/hub/114319/hubfs/2016/Rezora/ic_openHouse.png?width=100&amp;name=ic_openHouse.png\" width=\"100\" style=\"padding-bottom: 0; vertical-align: bottom;\">\n" +
"											  </td>\n" +
"											</tr>\n" +
"										  </tbody>\n" +
"										</table>\n" +
"									  </td>\n" +
"									</tr>\n" +
"								  </tbody>\n" +
"								</table>\n" +
"\n" +
"								<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnTextBlock\" style=\"min-width:100%;\">\n" +
"								  <tbody class=\"mcnTextBlockOuter\">\n" +
"									<tr>\n" +
"									  <td valign=\"top\" class=\"mcnTextBlockInner\">\n" +
"\n" +
"										<table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"min-width:100%;\" class=\"mcnTextContentContainer\">\n" +
"										  <tbody>\n" +
"											<tr>\n" +
"\n" +
"											  <td valign=\"top\" class=\"mcnTextContent\" style=\"padding-top:15px;padding-bottom: 50px; text-align: center; text-transform: capitalize;\">\n" +
"\n" +
"												<span style=\"font-size:110%\"><span style=\"font-family: 'Lato', sans-serif; font-weight: 600;\">Open House </span></span>\n" +
"												<br>\n" +
"												<span style=\"font-family: 'Lato', sans-serif;\"><span style=\"font-size:100%; color: rgba(0, 0, 0, .54);\"> Thurs-Sun 1-4pm \n" +
"													<br>by Appointment</span></span>\n" +
"											  </td>\n" +
"											</tr>\n" +
"										  </tbody>\n" +
"										</table>\n" +
"\n" +
"									  </td>\n" +
"									</tr>\n" +
"								  </tbody>\n" +
"								</table>\n" +
"							  </td>\n" +
"							</tr>\n" +
"						  </tbody></table>\n" +
"\n" +
"						  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"266\" class=\"columnWrapper\">\n" +
"							<tbody><tr>\n" +
"							  <td valign=\"top\" class=\"columnContainer\">\n" +
"\n" +
"								<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnImageBlock\" style=\"min-width:100%;\">\n" +
"								  <tbody class=\"mcnImageBlockOuter\">\n" +
"									<tr>\n" +
"									  <td valign=\"top\" style=\"\" class=\"mcnImageBlockInner\">\n" +
"\n" +
"										<table align=\"left\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"mcnImageContentContainer\" style=\"min-width:100%;\">\n" +
"										  <tbody>\n" +
"											<tr>\n" +
"											  <td class=\"mcnImageContent\" valign=\"top\" style=\"padding-right:2px; padding-left:2px; padding-top: 0; padding-bottom: 0; text-align:center;\">\n" +
"												<img align=\"center\" alt=\"\" src=\"https://cdn2.hubspot.net/hub/114319/hubfs/2016/Rezora/ic_previewEvent.png?nosize&amp;width=100&amp;name=ic_previewEvent.png\" width=\"100\" style=\"padding-bottom: 0; vertical-align: bottom;\">\n" +
"											  </td>\n" +
"											</tr>\n" +
"										  </tbody>\n" +
"										</table>\n" +
"									  </td>\n" +
"									</tr>\n" +
"								  </tbody>\n" +
"								</table>\n" +
"\n" +
"								<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnTextBlock\" style=\"min-width:100%;\">\n" +
"								  <tbody class=\"mcnTextBlockOuter\">\n" +
"									<tr>\n" +
"									  <td valign=\"top\" class=\"mcnTextBlockInner\">\n" +
"\n" +
"										<table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"min-width:100%;\" class=\"mcnTextContentContainer\">\n" +
"										  <tbody>\n" +
"											<tr>\n" +
"											  <td valign=\"top\" class=\"mcnTextContent\" style=\"padding-top:15px; padding-bottom: 50px; text-align:center; padding-left:2px; text-transform: capitalize;\">\n" +
"												<span style=\"font-size:110%\"><span style=\"font-family: 'Lato', sans-serif; font-weight: 600; padding-left:2px;\">preview event</span></span>\n" +
"												<br>\n" +
"												<span style=\"font-family: 'Lato', sans-serif;\"><span style=\"font-size:100%; color: rgba(0, 0, 0, .54);\">January  24th<br>\n" +
"	12pm - 2pm</span></span>\n" +
"											  </td>\n" +
"											</tr>\n" +
"										  </tbody>\n" +
"										</table>\n" +
"									  </td>\n" +
"									</tr>\n" +
"								  </tbody>\n" +
"								</table>\n" +
"							  </td>\n" +
"							</tr>\n" +
"						  </tbody></table>\n" +
"\n" +
"						  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"266\" class=\"columnWrapper\">\n" +
"							<tbody><tr>\n" +
"							  <td valign=\"top\" class=\"columnContainer\">\n" +
"\n" +
"								<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnImageBlock\" style=\"min-width:100%;\">\n" +
"								  <tbody class=\"mcnImageBlockOuter\">\n" +
"									<tr>\n" +
"									  <td valign=\"top\" style=\"\" class=\"mcnImageBlockInner\">\n" +
"\n" +
"										<table align=\"left\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"mcnImageContentContainer\" style=\"min-width:100%;\">\n" +
"										  <tbody>\n" +
"											<tr>\n" +
"											  <td class=\"mcnImageContent\" valign=\"top\" style=\"padding-top:0; padding-bottom: 0; text-align: center;\">\n" +
"												<img align=\"center\" alt=\"\" src=\"https://cdn2.hubspot.net/hub/114319/hubfs/2016/Rezora/ic_bidders.png?width=100&amp;name=ic_bidders.png\" width=\"100\" style=\"padding-bottom: 0; vertical-align: bottom;\">\n" +
"											  </td>\n" +
"											</tr>\n" +
"										  </tbody>\n" +
"										</table>\n" +
"									  </td>\n" +
"									</tr>\n" +
"								  </tbody>\n" +
"								</table>\n" +
"\n" +
"								<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnTextBlock\" style=\"min-width:100%;\">\n" +
"								  <tbody class=\"mcnTextBlockOuter\">\n" +
"									<tr>\n" +
"									  <td valign=\"top\" class=\"mcnTextBlockInner\">\n" +
"\n" +
"										<table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"min-width:100%;\" class=\"mcnTextContentContainer\">\n" +
"										  <tbody>\n" +
"											<tr>\n" +
"											  <td valign=\"top\" align=\"center\" class=\"mcnTextContent\" style=\"padding-top:15px; padding-bottom: 50px; padding-left:2px; text-align: center; text-transform: capitalize;\">\n" +
"												<span style=\"font-size:110%;\"><span style=\"font-family: 'Lato', sans-serif; font-weight: 600\">auction</span></span>\n" +
"												<br>\n" +
"												<span style=\"font-family: 'Lato', sans-serif;\"><span style=\"font-size:100%; color: rgba(0, 0, 0, .54);\">February 9th<br>Instant Gavel App</span></span>\n" +
"											  </td>\n" +
"											</tr>\n" +
"										  </tbody>\n" +
"										</table>\n" +
"									  </td>\n" +
"									</tr>\n" +
"								  </tbody>\n" +
"								</table>\n" +
"							  </td>\n" +
"							</tr>\n" +
"						  </tbody></table>\n" +
"						</td>\n" +
"					  </tr>\n" +
"\n" +
"				   <tr>\n" +
"					<td valign=\"top\" id=\"templateUpperColumns\">\n" +
"					  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnTextBlock\" style=\"min-width:100%;\">\n" +
"						<tbody class=\"mcnTextBlockOuter\">\n" +
"						  <tr>\n" +
"							<td valign=\"top\" class=\"mcnTextBlockInner\">\n" +
"\n" +
"							  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"min-width:100%;\" class=\"mcnTextContentContainer\">\n" +
"								<tbody>\n" +
"								  <tr>\n" +
"									<td align=\"center\" valign=\"top\" id=\"templateUpperColumns\">\n" +
"									  <div class=\"sectionHeaderContainer\" style=\"width: 95%; text-align: center; border-bottom: 1px solid rgba(0,0,0,.12); line-height: 0%; margin-bottom: 25px; margin-top: 25px;\">\n" +
"										<span class=\"sectionHeader\" style=\"font-family: 'Lato', sans-serif; font-weight: 600;text-transform: uppercase; background: white; padding: 0 10px; letter-spacing: 2px; font-size: 16px;\">get a closer look</span>\n" +
"									  </div>\n" +
"									</td>\n" +
"								  </tr>\n" +
"								</tbody>\n" +
"							  </table>\n" +
"							</td>\n" +
"						  </tr>\n" +
"						</tbody>\n" +
"					  </table>\n" +
"					</td>\n" +
"				  </tr>\n" +
"				  <tr>\n" +
"					<td valign=\"top\" id=\"templateUpperColumns\" style=\"padding-left: 18px; padding-right: 18px; padding-bottom: 38px;\">\n" +
"\n" +
"					  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"200\" class=\"columnWrapper\">\n" +
"						<tr>\n" +
"						  <td valign=\"top\" class=\"columnContainer\">\n" +
"\n" +
"							<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnImageBlock\" style=\"min-width:100%;\">\n" +
"							  <tbody class=\"mcnImageBlockOuter\">\n" +
"								<tr>\n" +
"								  <td valign=\"top\" style=\"\" class=\"mcnImageBlockInner\">\n" +
"\n" +
"									<table align=\"left\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"mcnImageContentContainer\" style=\"min-width:100%;\">\n" +
"									  <tbody>\n" +
"										<tr>\n" +
"										  <td class=\"mcnImageContent\" valign=\"top\" style=\"padding-top: 0; padding-bottom: 0; text-align:center;\">\n" +
"											<a href=\"https://www.conciergeauctions.com/auctions/856-silvertip-heights-canmore-alberta\" title=\"CANMORE, ALBERTA\" class=\"\" target=\"_blank\">\n" +
"											  <img align=\"center\" alt=\"CANMORE, ALBERTA\" src=\"http://web2.conciergeauctions.com/hubfs/2017/January%20Catalogue/856%20Silvertip%20Heights,%20Canmore,%20AB%20Canada/856-Silvertip-Heights,-Canmore,-AB-Canada-Closer-Look-2.jpg?noresize\" width=\"242\" style=\"padding-bottom: 2px; vertical-align: bottom;\" class=\"mcnImage\">\n" +
"											</a>\n" +
"										  </td>\n" +
"										</tr>\n" +
"									  </tbody>\n" +
"									</table>\n" +
"								  </td>\n" +
"								</tr>\n" +
"							  </tbody>\n" +
"							</table>\n" +
"						  </td>\n" +
"						</tr>\n" +
"					  </table>\n" +
"\n" +
"					  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"200\" class=\"columnWrapper\">\n" +
"						<tr>\n" +
"						  <td valign=\"top\" class=\"columnContainer\">\n" +
"\n" +
"							<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnImageBlock\" style=\"min-width:100%;\">\n" +
"							  <tbody class=\"mcnImageBlockOuter\">\n" +
"								<tr>\n" +
"								  <td valign=\"top\" style=\"\" class=\"mcnImageBlockInner\">\n" +
"\n" +
"									<table align=\"left\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"mcnImageContentContainer\" style=\"min-width:100%;\">\n" +
"									  <tbody>\n" +
"										<tr>\n" +
"										  <td class=\"mcnImageContent\" valign=\"top\" style=\"padding-right:2px; padding-left:2px; padding-top: 0; padding-bottom: 0; text-align:center;\">\n" +
"											 <a href=\"https://www.conciergeauctions.com/auctions/856-silvertip-heights-canmore-alberta\" title=\"CANMORE, ALBERTA\" class=\"\" target=\"_blank\">\n" +
"											  <img align=\"center\" alt=\"CANMORE, ALBERTA\" src=\"http://web2.conciergeauctions.com/hubfs/2017/January%20Catalogue/856%20Silvertip%20Heights,%20Canmore,%20AB%20Canada/856-Silvertip-Heights,-Canmore,-AB-Canada-Closer-Look-1.jpg?noresize\" width=\"242\" style=\"padding-bottom: 2px; vertical-align: bottom;\" class=\"mcnImage\">\n" +
"											</a>\n" +
"										  </td>\n" +
"										</tr>\n" +
"									  </tbody>\n" +
"									</table>\n" +
"								  </td>\n" +
"								</tr>\n" +
"							  </tbody>\n" +
"							</table>\n" +
"						  </td>\n" +
"						</tr>\n" +
"					  </table>\n" +
"\n" +
"					  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"200\" class=\"columnWrapper\">\n" +
"						<tr>\n" +
"						  <td valign=\"top\" class=\"columnContainer\">\n" +
"\n" +
"							<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnImageBlock\" style=\"min-width:100%;\">\n" +
"							  <tbody class=\"mcnImageBlockOuter\">\n" +
"								<tr>\n" +
"								  <td valign=\"top\" style=\"\" class=\"mcnImageBlockInner\">\n" +
"\n" +
"									<table align=\"left\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"mcnImageContentContainer\" style=\"min-width:100%;\">\n" +
"									  <tbody>\n" +
"										<tr>\n" +
"										  <td class=\"mcnImageContent\" valign=\"top\" style=\"padding-top:0; padding-bottom: 0; text-align: center;\">\n" +
"											<a href=\"https://www.conciergeauctions.com/auctions/856-silvertip-heights-canmore-alberta\" title=\"CANMORE, ALBERTA\" class=\"\" target=\"_blank\">\n" +
"											  <img align=\"center\" alt=\"CANMORE, ALBERTA\" src=\"http://web2.conciergeauctions.com/hubfs/2017/January%20Catalogue/856%20Silvertip%20Heights,%20Canmore,%20AB%20Canada/856-Silvertip-Heights,-Canmore,-AB-Canada-Closer-Look-4.jpg?noresize\" width=\"242\" style=\"padding-bottom: 2px; vertical-align: bottom;\" class=\"mcnImage\">\n" +
"											</a>\n" +
"										  </td>\n" +
"										</tr>\n" +
"									  </tbody>\n" +
"									</table>\n" +
"								  </td>\n" +
"								</tr>\n" +
"							  </tbody>\n" +
"							</table>\n" +
"						  </td>\n" +
"						</tr>\n" +
"\n" +
"					  </table>\n" +
"						<tr>\n" +
"					<td valign=\"top\" id=\"templateUpperColumns\">\n" +
"					  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnTextBlock\" style=\"min-width:100%;\">\n" +
"						<tbody class=\"mcnTextBlockOuter\">\n" +
"						  <tr>\n" +
"							<td valign=\"top\" class=\"mcnTextBlockInner\">\n" +
"							  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"min-width:100%;\" class=\"mcnTextContentContainer\">\n" +
"								<tbody>\n" +
"								  <tr>\n" +
"									<td valign=\"top\" id=\"templateUpperColumns\">\n" +
"									  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnTextBlock\" style=\"min-width:100%;\">\n" +
"										<tbody class=\"mcnTextBlockOuter\">\n" +
"										  <tr>\n" +
"											<td align=\"center\" valign=\"top\" id=\"templateUpperColumns\">\n" +
"											  <div class=\"sectionHeaderContainer\" style=\"width: 95%; text-align: center; border-bottom: 1px solid rgba(0,0,0,.12); line-height: 0%; margin-bottom: 30px; margin-top: 20px;\">\n" +
"											  </div>\n" +
"											</td>\n" +
"										  </tr>\n" +
"										  <tr>\n" +
"											<td valign=\"top\">\n" +
"											  <div align=\"left\" style=\"float: left; width: 50%; padding: 20px 36px\" class=\"instantGavelLeftColumn\">\n" +
"												<span style=\"font-family: 'Lato', sans-serif; font-weight: 700; text-transform: uppercase; color: rgba(0,0,0,.54); display: block; padding-bottom: 7px; font-size: 14px;\">become a member</span>\n" +
"												<span style=\"font-family: 'Lato', sans-serif; font-weight: 700; font-size: 18px; color: rgba(0,0,0,.87); font-size: 18px; line-height: 24px;\">Get access to our marketplace of exclusive properties and more.</span>\n" +
"												<span style=\"font-family: 'Lato', sans-serif; display: block; padding-top: 15px; font-size: 16px; color: rgba(0,0,0,.54); line-height: 24px;\">View full photography and industry-leading films. Download and view due diligence documents. Receive downloadable e-books.</span>\n" +
"												<div style=\"margin-top:35px; padding-bottom: 30px;\">\n" +
"												  <a href=\"https://www.conciergeauctions.com/auctions/116-bacon-rd-old-westbury-ny\" style=\"font-family: 'Lato', sans-serif;color:#ffffff;font-size:16px;text-decoration:none;background:#ffc107;padding:10px 30px;border-radius:2px; text-transform: uppercase; box-shadow:0 1px 6px rgba(0,0,0,0.12), 0 1px 4px rgba(0,0,0,0.12)\" target=\"_blank\">sign up today</a>\n" +
"												</div>\n" +
"											  </div>\n" +
"											  <div align=\"center\" style=\"float: left;\" id=\"instant_gavel\">\n" +
"												<img src=\"http://web2.conciergeauctions.com/hubfs/2016/Rezora/img_becomeMember.png\" width=\"275\" style=\"padding-bottom: 38px;\">\n" +
"											  </div>\n" +
"											</td>\n" +
"										  </tr>\n" +
"										</tbody>\n" +
"									  </table>\n" +
"									</td>\n" +
"								  </tr>\n" +
"								</tbody>\n" +
"							  </table>\n" +
"							</td>\n" +
"						  </tr>\n" +
"						</tbody>\n" +
"					  </table>\n" +
"					</td>\n" +
"				  </tr>\n" +
"					</td>\n" +
"				  </tr>\n" +
"				</table> \n" +
"\n" +
"				<tr>\n" +
"				  <td valign=\"top\" id=\"templateFooter\" align=\"center\">\n" +
"					<hr style=\"margin: 10px auto 25px; max-width: 800px; border: none; height: 1px; background-color: rgba(0, 0, 0, .12);\" id=\"horizontalRule\">\n" +
"\n" +
"					<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"mcnFollowBlock\" style=\"max-width: 800px; display: inline-block;\">\n" +
"					  <tbody class=\"mcnFollowBlockOuter\">\n" +
"						<tr>\n" +
"						  <td align=\"center\" valign=\"top\" class=\"mcnFollowBlockInner\">\n" +
"\n" +
"							<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnFollowContentContainer\">\n" +
"							  <tbody>\n" +
"								<tr>\n" +
"								  <td>\n" +
"\n" +
"									<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"min-width:100%;\" class=\"mcnFollowContent\">\n" +
"									  <tbody>\n" +
"										<tr>\n" +
"										  <td align=\"center\" valign=\"top\">\n" +
"											<div style=\"display: inline-block\">\n" +
"											  <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
"												<tbody>\n" +
"												  <tr>\n" +
"													<td align=\"center\" valign=\"top\" style=\"border-right: 1px solid rgba(0,0,0,.12); padding-right: 50px;\" class=\"socialPane\">\n" +
"													  <div style=\"text-align: center;\"><span style=\"font-size:15px; font-family: 'Lato', sans-serif; font-weight:600; letter-spacing: 1.25px; text-transform: uppercase; line-height: 22px;\"><span class=\"shortDescription\">stay in the know</span>\n" +
"														<br/>follow us on social</span>\n" +
"														<br/>\n" +
"													  </div>\n" +
"\n" +
"													  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\"  style=\"display:inline; padding-top: 15px;\" class=\"socialIcons\">\n" +
"														<tbody>\n" +
"														  <tr>\n" +
"															<td valign=\"top\" class=\"mcnFollowContentItemContainer\">\n" +
"\n" +
"															  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnFollowContentItem\">\n" +
"																<tbody>\n" +
"																  <tr>\n" +
"																	<td align=\"left\" valign=\"middle\" style=\"padding: 5px 7px;\" class=\"socialIcon\">\n" +
"\n" +
"																	  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
"																		<tbody>\n" +
"																		  <tr>\n" +
"																			<td align=\"center\" valign=\"middle\" width=\"30\" class=\"mcnFollowIconContent\">\n" +
"																			  <a href=\"http://www.facebook.com/ConciergeAuctions\" target=\"_blank\"><img src=\"https://cdn-images.mailchimp.com/icons/social-block-v2/dark-facebook-48.png\" style=\"display:block;\" width=\"30\"></a>\n" +
"																			</td>\n" +
"																		  </tr>\n" +
"																		</tbody>\n" +
"																	  </table>\n" +
"																	</td>\n" +
"																  </tr>\n" +
"																</tbody>\n" +
"															  </table>\n" +
"															</td>\n" +
"														  </tr>\n" +
"														</tbody>\n" +
"													  </table>\n" +
"\n" +
"													  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"display:inline; padding-top: 15px;\" class=\"socialIcons\">\n" +
"														<tbody>\n" +
"														  <tr>\n" +
"															<td valign=\"top\" class=\"mcnFollowContentItemContainer\">\n" +
"\n" +
"															  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnFollowContentItem\">\n" +
"																<tbody>\n" +
"																  <tr>\n" +
"																	<td align=\"left\" valign=\"middle\" style=\"padding: 5px 7px;\" class=\"socialIcon\">\n" +
"\n" +
"																	  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
"																		<tbody>\n" +
"																		  <tr>\n" +
"																			<td align=\"center\" valign=\"middle\" width=\"30\" class=\"mcnFollowIconContent\">\n" +
"																			  <a href=\"http://www.youtube.com/user/ConciergeAuctions\" target=\"_blank\"><img src=\"https://cdn-images.mailchimp.com/icons/social-block-v2/dark-youtube-48.png\" style=\"display:block;\" width=\"30\"></a>\n" +
"																			</td>\n" +
"																		  </tr>\n" +
"																		</tbody>\n" +
"																	  </table>\n" +
"																	</td>\n" +
"																  </tr>\n" +
"																</tbody>\n" +
"															  </table>\n" +
"															</td>\n" +
"														  </tr>\n" +
"														</tbody>\n" +
"													  </table>\n" +
"\n" +
"													  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"display:inline; padding-top: 15px;\" class=\"socialIcons\">\n" +
"														<tbody>\n" +
"														  <tr>\n" +
"															<td valign=\"top\" class=\"mcnFollowContentItemContainer\">\n" +
"\n" +
"															  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnFollowContentItem\">\n" +
"																<tbody>\n" +
"																  <tr>\n" +
"																	<td align=\"left\" valign=\"middle\" style=\"padding: 5px 7px;\" class=\"socialIcon\">\n" +
"\n" +
"																	  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
"																		<tbody>\n" +
"																		  <tr>\n" +
"																			<td align=\"center\" valign=\"middle\" width=\"30\" class=\"mcnFollowIconContent\">\n" +
"																			  <a href=\"https://plus.google.com/114233341720328809458/posts\" target=\"_blank\"><img src=\"https://cdn-images.mailchimp.com/icons/social-block-v2/dark-googleplus-48.png\" style=\"display:block;\" width=\"30\"></a>\n" +
"																			</td>\n" +
"																		  </tr>\n" +
"																		</tbody>\n" +
"																	  </table>\n" +
"																	</td>\n" +
"																  </tr>\n" +
"																</tbody>\n" +
"															  </table>\n" +
"															</td>\n" +
"														  </tr>\n" +
"														</tbody>\n" +
"													  </table>\n" +
"\n" +
"													  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"display:inline; padding-top: 15px;\" class=\"socialIcons\">\n" +
"														<tbody>\n" +
"														  <tr>\n" +
"															<td valign=\"top\" class=\"mcnFollowContentItemContainer\">\n" +
"\n" +
"															  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnFollowContentItem\">\n" +
"																<tbody>\n" +
"																  <tr>\n" +
"																	<td align=\"left\" valign=\"middle\" style=\"padding: 5px 7px;\" class=\"socialIcon\">\n" +
"\n" +
"																	  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
"																		<tbody>\n" +
"																		  <tr>\n" +
"																			<td align=\"center\" valign=\"middle\" width=\"30\" class=\"mcnFollowIconContent\">\n" +
"																			  <a href=\"http://www.linkedin.com/company/368298\" target=\"_blank\"><img src=\"https://cdn-images.mailchimp.com/icons/social-block-v2/dark-linkedin-48.png\" style=\"display:block;\" width=\"30\"></a>\n" +
"																			</td>\n" +
"																		  </tr>\n" +
"																		</tbody>\n" +
"																	  </table>\n" +
"																	</td>\n" +
"																  </tr>\n" +
"																</tbody>\n" +
"															  </table>\n" +
"															</td>\n" +
"														  </tr>\n" +
"														</tbody>\n" +
"													  </table>\n" +
"\n" +
"													  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"display:inline; padding-top: 15px;\" class=\"socialIcons\">\n" +
"														<tbody>\n" +
"														  <tr>\n" +
"															<td valign=\"top\" class=\"mcnFollowContentItemContainer\">\n" +
"\n" +
"															  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnFollowContentItem\">\n" +
"																<tbody>\n" +
"																  <tr>\n" +
"																	<td align=\"left\" valign=\"middle\" style=\"padding: 5px 7px;\" class=\"socialIcon\">\n" +
"\n" +
"																	  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
"																		<tbody>\n" +
"																		  <tr>\n" +
"																			<td align=\"center\" valign=\"middle\" width=\"30\" class=\"mcnFollowIconContent\">\n" +
"																			  <a href=\"http://pinterest.com/conciergeluxury/\" target=\"_blank\"><img src=\"https://cdn-images.mailchimp.com/icons/social-block-v2/dark-pinterest-48.png\" style=\"display:block;\" width=\"30\"></a>\n" +
"																			</td>\n" +
"																		  </tr>\n" +
"																		</tbody>\n" +
"																	  </table>\n" +
"																	</td>\n" +
"																  </tr>\n" +
"																</tbody>\n" +
"															  </table>\n" +
"															</td>\n" +
"														  </tr>\n" +
"														</tbody>\n" +
"													  </table>\n" +
"\n" +
"													  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"display:inline; padding-top: 15px;\" class=\"socialIcons\" id=\"lastSocial\">\n" +
"														<tbody>\n" +
"														  <tr>\n" +
"															<td valign=\"top\" style=\"padding-right:0; padding-bottom:9px;\" class=\"mcnFollowContentItemContainer\">\n" +
"\n" +
"															  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnFollowContentItem\">\n" +
"																<tbody>\n" +
"																  <tr>\n" +
"																	<td align=\"left\" valign=\"middle\" style=\"padding: 5px 7px;\" class=\"socialIcon\">\n" +
"\n" +
"																	  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
"																		<tbody>\n" +
"																		  <tr>\n" +
"																			<td align=\"center\" valign=\"middle\" width=\"30\" class=\"mcnFollowIconContent\">\n" +
"																			  <a href=\"http://instagram.com/conciergeauctions\" target=\"_blank\"><img src=\"https://cdn-images.mailchimp.com/icons/social-block-v2/dark-instagram-48.png\" style=\"display:block;\" width=\"30\"></a>\n" +
"																			</td>\n" +
"																		  </tr>\n" +
"																		</tbody>\n" +
"																	  </table>\n" +
"																	</td>\n" +
"																  </tr>\n" +
"																</tbody>\n" +
"															  </table>\n" +
"															</td>\n" +
"														  </tr>\n" +
"														</tbody>\n" +
"													  </table>\n" +
"													</td>\n" +
"												  </tr>\n" +
"												</tbody>\n" +
"											  </table>\n" +
"											</div>\n" +
"											<div style=\"display: inline-block\">\n" +
"											  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
"												<tbody>\n" +
"												  <tr>\n" +
"													<td align=\"center\" valign=\"top\" style=\"padding-left: 50px;\" class=\"socialPane\">\n" +
"													  <div style=\"text-align: center; padding-bottom:10px;\"><span style=\"font-size:15px; font-family: 'Lato', sans-serif; font-weight:600; letter-spacing: 1.25px; text-transform: uppercase; line-height: 22px;\"><span class=\"shortDescription\">bid &amp; watch auctions live</span>\n" +
"														<br/>download our <i>instant gavel</i> app</span>\n" +
"														<br/>\n" +
"														<a href=\"https://itunes.apple.com/us/app/instant-gavel/id979968478?mt=8\" target=\"_blank\"><img src=\"http://web2.conciergeauctions.com/hubfs/2016/Rezora/ic_appleAppStore.png\" style=\"display:inline-block; margin-right: 10px; margin-top: 18px;\" width=\"110\"></a>\n" +
"														<a href=\"https://play.google.com/store/apps/details?id=com.bidwrangler.conciergeauctions\" target=\"_blank\"><img src=\"http://web2.conciergeauctions.com/hubfs/2016/Rezora/ic_googleStore.png\" style=\"display:inline-block; margin-top: 18px;\" width=\"110\"></a>\n" +
"													  </div>\n" +
"													</td>\n" +
"												  </tr>\n" +
"												</tbody>\n" +
"											  </table>\n" +
"											</div>\n" +
"										  </td>\n" +
"										</tr>\n" +
"									  </tbody>\n" +
"									</table>\n" +
"								  </td>\n" +
"								</tr>\n" +
"							  </tbody>\n" +
"							</table>\n" +
"						  </td>\n" +
"						</tr>\n" +
"					  </tbody>\n" +
"					</table>\n" +
"\n" +
"					<hr style=\"margin: 15px auto 25px; max-width: 800px; border: none; height: 1px; background-color: rgba(0, 0, 0, .12);\">\n" +
"\n" +
"					<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnTextBlock\" style=\"min-width:100%;\">\n" +
"					  <tbody class=\"mcnTextBlockOuter\">\n" +
"						<tr>\n" +
"						  <td align=\"center\" valign=\"top\" class=\"mcnTextBlockInner\">\n" +
"\n" +
"							<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"max-width: 800px;\" class=\"mcnTextContentContainer\">\n" +
"							  <tbody>\n" +
"								<tr>\n" +
"								  <td align=\"center\" valign=\"top\" class=\"mcnTextContent\">\n" +
"									<p id=\"footer\" style=\"font-family: Lato, Geneva, Verdana, Arial, Helvetica, sans-serif; text-align: center; font-size: 12px; line-height: 1em; display: block; padding: 0 50px 0 50px;\"><span style=\"font-size: 10px; color: rgba(0, 0, 0, .54);\">{{site_settings.company_name}}, {{site_settings.company_street_address_1}} {{site_settings.company_street_address_2}}, {{site_settings.company_city}}, {{site_settings.company_state}} {{site_settings.company_zip}} {{site_settings.company_country}} </span>\n" +
"									  <br/>\n" +
"									  <br/><span style=\"font-size: 10px; color: rgba(0, 0, 0, .54);\"> You received this email because you are subscribed to {{ subscription_name }} from {{site_settings.company_name}}. </span>\n" +
"									  <br/>\n" +
"									  <br/><span style=\"font-size: 10px; color: rgba(0, 0, 0, .54);\"> Update your <a target=\"_blank\" href=\"{{ unsubscribe_link }}\" style=\"text-decoration: underline; whitespace: nowrap; color:rgba(0, 0, 0, .54);\" data-unsubscribe=\"true\">email preferences</a> to choose the types of emails you receive. </span>\n" +
"									  <br/>\n" +
"									  <br/><span style=\"font-size: 10px; color: rgba(0, 0, 0, .54);\"> &nbsp;<a target=\"_blank\" href=\"{{ unsubscribe_link_all }}\" style=\"text-decoration: underline; whitespace: nowrap; color:rgba(0, 0, 0, .54);\" data-unsubscribe=\"true\">Unsubscribe from all future emails</a>&nbsp;</span><span style=\"color: rgba(0, 0, 0, .54);\">| </span><a href=\"http://web2.conciergeauctions.com/hubfs/2017/January%20Catalogue/856%20Silvertip%20Heights,%20Canmore,%20AB%20Canada/856-Silvertip-Heights,-Canmore,-AB-Canada-Disclaimer.jpg\" style=\"text-decoration: underline; whitespace: nowrap; font-size:10px; color:rgba(0, 0, 0, .54);\" target=\"_blank\">Disclaimer</a></p>\n" +
"								  </td>\n" +
"								</tr>\n" +
"							  </tbody>\n" +
"							</table>\n" +
"						  </td>\n" +
"						</tr>\n" +
"					  </tbody>\n" +
"					</table>\n" +
"				  </td>\n" +
"				</tr>\n" +
"			  </table>\n" +
"			</td>\n" +
"		  </tr>\n" +
"		</table>\n" +
"	  </center>\n" +
"	</body>\n" +
"	</html>";
String html1 = html.replaceAll("CANMORE, ALBERTA",propertyname);
String html2 = html1.replaceAll("https://www.conciergeauctions.com/auctions/856-silvertip-heights-canmore-alberta",URL);
String html3=html2.replace("Appraised at over $4 million, this contemporary estate in Canmore’s world-class Silvertip golf resort is a unique investment opportunity for a smart buyer. \n" +
"\n" +
" <br><br><i>\n" +
"                                      Bid via Instant Gavel</i>", bodytext);
String html4=html3.replace("http://web2.conciergeauctions.com/hubfs/2017/January%20Catalogue/856%20Silvertip%20Heights,%20Canmore,%20AB%20Canada/856-Silvertip-Heights,-Canmore,-AB-Canada-Disclaimer.jpg",disclamier);
String html5=html4.replace("http://web2.conciergeauctions.com/hubfs/2017/January%20Catalogue/856%20Silvertip%20Heights,%20Canmore,%20AB%20Canada/856-Silvertip-Heights,-Canmore,-AB-Canada-Closer-Look-2.jpg",img1url);
String html6=html5.replace("http://web2.conciergeauctions.com/hubfs/2017/January%20Catalogue/856%20Silvertip%20Heights,%20Canmore,%20AB%20Canada/856-Silvertip-Heights,-Canmore,-AB-Canada-Closer-Look-1.jpg",img2url);
String html7=html6.replace("http://web2.conciergeauctions.com/hubfs/2017/January%20Catalogue/856%20Silvertip%20Heights,%20Canmore,%20AB%20Canada/856-Silvertip-Heights,-Canmore,-AB-Canada-Closer-Look-4.jpg",img3url);
String html8=html7.replace("http://web2.conciergeauctions.com/hubfs/2017/January%20Catalogue/856%20Silvertip%20Heights,%20Canmore,%20AB%20Canada/856-Silvertip-Heights,-Canmore,-AB-Canada-HeroImage-2.jpg", herourl);
String html9=html8.replace("February 9th",auctiondate);
String html10=html9.replace("January  24th",previewdate);
String html11=html10.replace(" Thurs-Sun 1-4pm<br>by Appointment",openhouse);
String html12=html11.replace("Previously $3.5M | Selling Without Reserve",sellingprice);
String finalhtml=html12.replace("12pm - 2pm", previewtime);
return finalhtml;
      
    }
   public static String returnlaunchemailnoeventhtml(String[] args) {
       String propertyname=args[0];    
         
         String bodytext=args[1]; //title
         
         String URL=args[2];
          
         String disclamier=args[3];
        
         String img1url=args[4];
         
         String img2url=args[5];
         
         String img3url= args[6];
        
         String herourl=args[7];
         
         String auctiondate= args[8];
         
         String openhouse=args[9];
         
         String sellingprice = args[10];
         
        
       
      String html="<!doctype html>\n" +
"<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\">\n" +
"\n" +
"<head>\n" +
"  <!-- NAME: 1:3:2 COLUMN -->\n" +
"  <!--[if gte mso 15]>\n" +
"        <xml>\n" +
"            <o:OfficeDocumentSettings>\n" +
"            <o:AllowPNG/>\n" +
"            <o:PixelsPerInch>96</o:PixelsPerInch>\n" +
"            </o:OfficeDocumentSettings>\n" +
"        </xml>\n" +
"        <![endif]-->\n" +
"  <meta charset=\"UTF-8\">\n" +
"  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
"  <title>*|MC:SUBJECT|*</title>\n" +
"  <!-- Added by Hubspot 3/2/16 -->\n" +
"  <!-- Preview text (text which appears right after subject) -->\n" +
"  <div id=\"preview_text\" style=\"display:none!important\">\n" +
"    {% text \"preview_text\" label=\"Preview Text <span class=help-text>This will be used as the preview text that displays in some email clients</span>\", value=\"\", no_wrapper=True %}\n" +
"  </div>\n" +
"\n" +
"  <link href='https://fonts.googleapis.com/css?family=Lato:400,700,900' rel='stylesheet' type='text/css'>\n" +
"  <!-- font-family: 'Lato', sans-serif; -->\n" +
"  <style type=\"text/css\">\n" +
"   p {\n" +
"      margin: 10px 0;\n" +
"      padding: 0;\n" +
"    }\n" +
"    \n" +
"    table {\n" +
"      border-collapse: collapse;\n" +
"    }\n" +
"    /*Added by Hubspot 3/2/16*/\n" +
"    /* Hide preview text on rendering */\n" +
"    \n" +
"    #preview_text {\n" +
"      display: none;\n" +
"    }\n" +
"    \n" +
"    img,\n" +
"    a img {\n" +
"      border: 0;\n" +
"      height: auto;\n" +
"      outline: none;\n" +
"      text-decoration: none;\n" +
"    }\n" +
"    \n" +
"    body,\n" +
"    #bodyTable,\n" +
"    #bodyCell {\n" +
"      height: 100%;\n" +
"      margin: 0;\n" +
"      padding: 0;\n" +
"      width: 100%;\n" +
"    }\n" +
"    \n" +
"    img {\n" +
"      -ms-interpolation-mode: bicubic;\n" +
"    }\n" +
"    \n" +
"    table {\n" +
"      mso-table-lspace: 0pt;\n" +
"      mso-table-rspace: 0pt;\n" +
"    }\n" +
"    \n" +
"    p,\n" +
"    a,\n" +
"    li,\n" +
"    td,\n" +
"    blockquote {\n" +
"      mso-line-height-rule: exactly;\n" +
"    }\n" +
"    \n" +
"    a[href^=tel],\n" +
"    a[href^=sms] {\n" +
"      color: inherit;\n" +
"      cursor: default;\n" +
"      text-decoration: none;\n" +
"    }\n" +
"    \n" +
"    p,\n" +
"    a,\n" +
"    li,\n" +
"    td,\n" +
"    body,\n" +
"    table,\n" +
"    blockquote {\n" +
"      -ms-text-size-adjust: 100%;\n" +
"      -webkit-text-size-adjust: 100%;\n" +
"    }\n" +
"    \n" +
"    a[x-apple-data-detectors] {\n" +
"      color: inherit !important;\n" +
"      text-decoration: none !important;\n" +
"      font-size: inherit !important;\n" +
"      font-family: inherit !important;\n" +
"      font-weight: inherit !important;\n" +
"      line-height: inherit !important;\n" +
"    }\n" +
"    \n" +
"    #bodyCell {\n" +
"      padding: 10px;\n" +
"    }\n" +
"    \n" +
"    a.mcnButton {\n" +
"      display: block;\n" +
"    }\n" +
"    \n" +
"    .mcnImage {\n" +
"      vertical-align: bottom;\n" +
"    }\n" +
"    \n" +
"    .mcnTextContent {\n" +
"      word-break: break-word;\n" +
"    }\n" +
"    \n" +
"    .mcnTextContent img {\n" +
"      height: auto !important;\n" +
"    }\n" +
"    \n" +
"    body,\n" +
"    #bodyTable {\n" +
"      background-color: #f9f9f9;\n" +
"      color: rgba(0, 0, 0, .87);\n" +
"    }\n" +
"    \n" +
"    #bodyCell {\n" +
"      border-top: 0;\n" +
"    }\n" +
"    \n" +
"    .templateContainer {\n" +
"      border: 0;\n" +
"    }\n" +
"    \n" +
"    #templatePreheader {\n" +
"      background-color: #F9F9F9;\n" +
"      border-top: 0;\n" +
"      border-bottom: 0;\n" +
"      padding-top: 0px;\n" +
"      padding-bottom: 0px;\n" +
"    }\n" +
"    \n" +
"    #templatePreheader .mcnTextContent,\n" +
"    #templatePreheader .mcnTextContent p {\n" +
"      color: rgba(0, 0, 0, .87);\n" +
"      font-family: lato;\n" +
"      font-size: 12px;\n" +
"      line-height: 150%;\n" +
"      text-align: left;\n" +
"    }\n" +
"    \n" +
"    #templatePreheader .mcnTextContent a,\n" +
"    #templatePreheader .mcnTextContent p a {\n" +
"      color: rgba(0, 0, 0, .87);\n" +
"      font-weight: normal;\n" +
"      text-decoration: underline;\n" +
"    }\n" +
"    \n" +
"    #templateHeader {\n" +
"      background-color: #FFFFFF;\n" +
"      border-top: 0;\n" +
"      border-bottom: 0;\n" +
"      padding-top: 30px;\n" +
"      padding-bottom: 0;\n" +
"    }\n" +
"    \n" +
"    #templateHeader .mcnTextContent,\n" +
"    #templateHeader .mcnTextContent p {\n" +
"      color: rgba(0, 0, 0, .87);\n" +
"      font-family: lato;\n" +
"      font-size: 16px;\n" +
"      line-height: 150%;\n" +
"      text-align: left;\n" +
"    }\n" +
"    \n" +
"    #templateHeader .mcnTextContent a,\n" +
"    #templateHeader .mcnTextContent p a {\n" +
"      font-weight: normal;\n" +
"      text-decoration: underline;\n" +
"    }\n" +
"    \n" +
"    #templateBody {\n" +
"      background-color: #FFFFFF;\n" +
"      border-top: 0;\n" +
"      border-bottom: 0;\n" +
"      padding-top: 0;\n" +
"      padding-bottom: 0;\n" +
"    }\n" +
"    \n" +
"    #templateBody .mcnTextContent,\n" +
"    #templateBody .mcnTextContent p {\n" +
"      color: rgba(0, 0, 0, .87);\n" +
"      font-family: lato;\n" +
"      font-size: 16px;\n" +
"      line-height: 150%;\n" +
"      text-align: left;\n" +
"    }\n" +
"    \n" +
"    #templateBody .mcnTextContent a,\n" +
"    #templateBody .mcnTextContent p a {\n" +
"      font-weight: normal;\n" +
"      text-decoration: underline;\n" +
"    }\n" +
"    \n" +
"    #templateUpperColumns {\n" +
"      background-color: #FFFFFF;\n" +
"      border-top: 0;\n" +
"      border-bottom: 0;\n" +
"      padding-top: 0;\n" +
"      padding-bottom: 0;\n" +
"    }\n" +
"    \n" +
"    #templateUpperColumns .columnContainer .mcnTextContent,\n" +
"    #templateUpperColumns .columnContainer .mcnTextContent p {\n" +
"      color: rgba(0, 0, 0, .87);\n" +
"      font-family: lato;\n" +
"      font-size: 16px;\n" +
"      line-height: 150%;\n" +
"      text-align: center;\n" +
"    }\n" +
"    \n" +
"    #templateUpperColumns .columnContainer .mcnTextContent a,\n" +
"    #templateUpperColumns .columnContainer .mcnTextContent p a {\n" +
"      font-weight: normal;\n" +
"      text-decoration: underline;\n" +
"    }\n" +
"    \n" +
"    #templateLowerColumns {\n" +
"      background-color: #FFFFFF;\n" +
"      border-top: 0;\n" +
"      padding-top: 0;\n" +
"      padding-bottom: 0px;\n" +
"    }\n" +
"    \n" +
"    #templateLowerColumns .columnContainer .mcnTextContent,\n" +
"    #templateLowerColumns .columnContainer .mcnTextContent p {\n" +
"      color: rgba(0, 0, 0, .87);\n" +
"      font-family: lato;\n" +
"      font-size: 16px;\n" +
"      line-height: 150%;\n" +
"      text-align: left;\n" +
"    }\n" +
"    \n" +
"    #templateLowerColumns .columnContainer .mcnTextContent a,\n" +
"    #templateLowerColumns .columnContainer .mcnTextContent p a {\n" +
"      font-weight: normal;\n" +
"      text-decoration: underline;\n" +
"    }\n" +
"    \n" +
"    #templateFooter {\n" +
"      background-color: #FAFAFA;\n" +
"      border-top: 0;\n" +
"      border-bottom: 0;\n" +
"      padding-top: 9px;\n" +
"      padding-bottom: 9px;\n" +
"    }\n" +
"    \n" +
"    #templateFooter .mcnTextContent,\n" +
"    #templateFooter .mcnTextContent p {\n" +
"      color: rgba(0, 0, 0, .87);\n" +
"      font-family: lato;\n" +
"      font-size: 12px;\n" +
"      line-height: 150%;\n" +
"      text-align: center;\n" +
"    }\n" +
"    \n" +
"    #templateFooter .mcnTextContent a,\n" +
"    #templateFooter .mcnTextContent p a {\n" +
"      color: rgba(0, 0, 0, .87);\n" +
"      font-weight: normal;\n" +
"      text-decoration: underline;\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      body,\n" +
"      table,\n" +
"      td,\n" +
"      p,\n" +
"      a,\n" +
"      li,\n" +
"      blockquote {\n" +
"        -webkit-text-size-adjust: none !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      f\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      #bodyCell {\n" +
"        padding-top: 10px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .columnWrapper {\n" +
"        max-width: 100% !important;\n" +
"        width: 100% !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcnImage {\n" +
"        width: 95% !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mobileTitle {\n" +
"        font-size: 28px !important;\n" +
"        padding-bottom: 10px !important;\n" +
"        line-height: 35px;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .menu-container {\n" +
"        padding-top: 10px !important;\n" +
"        padding-bottom: 10px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 374px) and (min-width: 320px) {\n" +
"      .menu-items {\n" +
"        font-size: 10px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) and (min-width: 375px) {\n" +
"      .menu-items {\n" +
"        font-size: 12px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .menu-item {\n" +
"        padding-right: 10px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mobileCatalogText {\n" +
"        padding-left: 0px !important;\n" +
"        padding-right: 0px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .companyLogo {\n" +
"        width: 250px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcnCaptionTopContent,\n" +
"      .mcnTextContentContainer,\n" +
"      .mcnBoxedTextContentContainer {\n" +
"        max-width: 100% !important;\n" +
"        width: 100% !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcnImageBlockInner,\n" +
"      .mcnImageContent {\n" +
"        padding: 0px 6px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcnTextContent {\n" +
"        padding-right: 24px !important;\n" +
"        padding-left: 24px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mobileHeader {\n" +
"        padding: 0 !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcnBoxedTextContentContainer {\n" +
"        min-width: 100% !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcnImageGroupContent {\n" +
"        padding: 9px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcnCaptionLeftContentOuter .mcnTextContent,\n" +
"      .mcnCaptionRightContentOuter .mcnTextContent {\n" +
"        padding-top: 9px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcnImageCardTopImageContent,\n" +
"      .mcnCaptionBlockInner .mcnCaptionTopContent:last-child .mcnTextContent {\n" +
"        padding-top: 18px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcnImageCardBottomImageContent {\n" +
"        padding-bottom: 9px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcnImageGroupBlockInner {\n" +
"        padding-top: 0 !important;\n" +
"        padding-bottom: 0 !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcnImageGroupBlockOuter {\n" +
"        padding-top: 9px !important;\n" +
"        padding-bottom: 9px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcnImageCardLeftImageContent,\n" +
"      .mcnImageCardRightImageContent {\n" +
"        padding-right: 18px !important;\n" +
"        padding-bottom: 0 !important;\n" +
"        padding-left: 18px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcpreview-image-uploader {\n" +
"        display: none !important;\n" +
"        width: 100% !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcnBoxedTextContentContainer .mcnTextContent,\n" +
"      .mcnBoxedTextContentContainer .mcnTextContent p {\n" +
"        font-size: 14px !important;\n" +
"        line-height: 150% !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      #templatePreheader {\n" +
"        display: block !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      #templatePreheader .mcnTextContent,\n" +
"      #templatePreheader .mcnTextContent p {\n" +
"        font-size: 14px !important;\n" +
"        line-height: 150% !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      #templateHeader .mcnTextContent,\n" +
"      #templateHeader .mcnTextContent p {\n" +
"        font-size: 16px !important;\n" +
"        line-height: 150% !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      #templateBody .mcnTextContent,\n" +
"      #templateBody .mcnTextContent p {\n" +
"        font-size: 16px !important;\n" +
"        line-height: 150% !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      #templateUpperColumns .columnContainer .mcnTextContent,\n" +
"      #templateUpperColumns .columnContainer .mcnTextContent p {\n" +
"        font-size: 16px !important;\n" +
"        line-height: 150% !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      #templateLowerColumns .columnContainer .mcnTextContent,\n" +
"      #templateLowerColumns .columnContainer .mcnTextContent p {\n" +
"        font-size: 16px !important;\n" +
"        line-height: 150% !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      #templateFooter .mcnTextContent,\n" +
"      #templateFooter .mcnTextContent p {\n" +
"        font-size: 14px !important;\n" +
"        line-height: 125% !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    .mobileHeader {\n" +
"      min-width: 798px !important;\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mobileHeader {\n" +
"        min-width: 0 !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .socialPane {\n" +
"        border-right: none !important;\n" +
"        padding-right: 0 !important;\n" +
"        padding-left: 0 !important;\n" +
"      }\n" +
"      .mcnFollowContentItemContainer {\n" +
"        padding-bottom: 10px !important;\n" +
"      }\n" +
"      #lastSocial {\n" +
"        padding-right: 0 !important;\n" +
"      }\n" +
"      .shortDescription {\n" +
"        display: none !important;\n" +
"      }\n" +
"      .socialIcons {\n" +
"        padding-top: 14px !important;\n" +
"      }\n" +
"      #horizontalRule {\n" +
"        margin-bottom: 15px !important;\n" +
"      }\n" +
"      .icon-container {\n" +
"        padding-right: 0 !important;\n" +
"        padding-left: 0 !important;\n" +
"      }\n" +
"      .sectionHeaderContainer {\n" +
"        width: 90% !important;\n" +
"      }\n" +
"    }\n" +
"  </style>\n" +
"</head>\n" +
"\n" +
"<body>\n" +
"  <div style=\"display:none; white-space:nowrap; font:15px courier; line-height:0;\">\n" +
"    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;\n" +
"  </div>\n" +
"  <center>\n" +
"\n" +
"    <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" height=\"100%\" width=\"100%\" id=\"bodyTable\">\n" +
"      <tr>\n" +
"        <td align=\"center\" valign=\"top\" id=\"bodyCell\">\n" +
"\n" +
"          <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"templateContainer\">\n" +
"            <tr>\n" +
"              <td valign=\"top\" id=\"templatePreheader\">\n" +
"               \n" +
"                <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnTextBlock\" style=\"max-width:800px; margin: 0 auto;\">\n" +
"                  <tbody class=\"mcnTextBlockOuter\">\n" +
"                    <tr>\n" +
"                      <td valign=\"top\" class=\"mcnTextBlockInner\">\n" +
"\n" +
"                        <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"282\" class=\"mcnTextContentContainer\">\n" +
"                          <tbody>\n" +
"                            <tr>\n" +
"                              <td valign=\"top\" class=\"mcnTextContent\" style=\"padding-top:9px; padding-left:18px; padding-bottom:9px; padding-right:0;\">\n" +
"                              </td>\n" +
"                            </tr>\n" +
"                          </tbody>\n" +
"                        </table>\n" +
"\n" +
"                        <table align=\"right\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"282\" class=\"mcnTextContentContainer\">\n" +
"                          <tbody>\n" +
"                            <tr>\n" +
"                              <td valign=\"top\" class=\"mcnTextContent\" style=\"padding-top:9px; padding-right:18px; padding-bottom:9px; padding-left:18px;\">\n" +
"                                {%if content.create_page%} <div style=\"text-align: right;\"><span style=\"font-size:10px;font-family: 'Lato', sans-serif;color:rgba(0, 0, 0, .87);\">\n" +
"                                  <a href=\"{{view_as_page_url}}\" target=\"_blank\">\n" +
"                        	                     <span style=\"color:rgba(0, 0, 0, .87)\">View in browser</span>{%endif%}\n" +
"                                  </a>\n" +
"                                  </span>\n" +
"                                </div>\n" +
"                              </td>\n" +
"                            </tr>\n" +
"                          </tbody>\n" +
"                        </table>\n" +
"                      </td>\n" +
"                    </tr>\n" +
"                  </tbody>\n" +
"                </table>\n" +
"              </td>\n" +
"            </tr>\n" +
"            <table style=\"max-width: 800px; box-shadow: 0 1px 6px rgba(0,0,0,0.12), 0 1px 4px rgba(0,0,0,0.12); display: inline-block;\">\n" +
"              <tr>\n" +
"                <td valign=\"top\" id=\"templateHeader\">\n" +
"                  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnImageBlock\" style=\"min-width:100%;\">\n" +
"                    <tbody class=\"mcnImageBlockOuter\">\n" +
"                      <tr>\n" +
"                        <td valign=\"top\" style=\"padding:10px 0 0;\" class=\"mcnImageBlockInner heroContainer\">\n" +
"\n" +
"                          <table align=\"left\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"mcnImageContentContainer\" style=\"min-width:100%;\">\n" +
"                            <tbody>\n" +
"                              <tr>\n" +
"                                <td class=\"mcnImageContent\" valign=\"top\" style=\"padding-right: 0px; padding-left: 0px; padding-top: 0; padding-bottom: 10px; text-align:center;\">\n" +
"                                  <a href=\"https://www.conciergeauctions.com\" target=\"_blank\">\n" +
"                                    <img align=\"center\" alt=\"\" src=\"https://cdn2.hubspot.net/hub/114319/hubfs/Logos/CA-logo-header-2.jpg?noresize\" width=\"369\" style=\"width:369; margin-bottom: 20px; display: inline !important; vertical-align: bottom;\" class=\"mcnImage companyLogo\">\n" +
"                                  </a>\n" +
"                                </td>\n" +
"                              </tr>\n" +
"                            </tbody>\n" +
"                          </table>\n" +
"                        </td>\n" +
"                      </tr>\n" +
"                    </tbody>\n" +
"                  </table>\n" +
"\n" +
"                  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnTextBlock\" style=\"min-width:100%;\">\n" +
"                    <tbody class=\"mcnTextBlockOuter\">\n" +
"                      <tr>\n" +
"                        <td valign=\"top\" class=\"mcnTextBlockInner\">\n" +
"\n" +
"                          <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"min-width:100%;\" class=\"mcnTextContentContainer\">\n" +
"                            <tbody>\n" +
"                              <tr>\n" +
"                                <td align=\"center\" valign=\"top\" id=\"templateUpperColumns\">\n" +
"                                  <div class=\"sectionHeaderContainer\" style=\"width: 95%; text-align: center; border-bottom: 1px solid rgba(0,0,0,.12); line-height: 0%; margin-bottom: 25px; margin-top: 25px;\">\n" +
"                                    <span class=\"sectionHeader\" style=\"font-family: 'Lato', sans-serif; font-weight: 600;text-transform: uppercase; background: white; padding: 0 10px; letter-spacing: 2px; font-size: 16px;\">you're invited</span>\n" +
"                                  </div>\n" +
"                                </td>\n" +
"                              </tr>\n" +
"                            </tbody>\n" +
"                          </table>\n" +
"                        </td>\n" +
"                      </tr>\n" +
"                    </tbody>\n" +
"                  </table>\n" +
"\n" +
"                  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnImageBlock\" style=\"min-width:100%;\">\n" +
"                    <tbody class=\"mcnImageBlockOuter\">\n" +
"                      <tr>\n" +
"                        <td valign=\"top\" style=\"\" class=\"mcnImageBlockInner mobileHeader\">\n" +
"\n" +
"                          <table align=\"left\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"mcnImageContentContainer\" style=\"min-width:100%;\">\n" +
"                            <tbody>\n" +
"                              <tr>\n" +
"                                <td class=\"mcnImageContent mobileHeader\" valign=\"top\" style=\"padding-top: 0; padding-bottom: 0; text-align:center;\">\n" +
"                                 <a href=\"https://www.conciergeauctions.com/auctions/856-silvertip-heights-canmore-alberta\" class=\"\" target=\"_blank\">\n" +
"                                    <img align=\"center\" alt=\"CANMORE, ALBERTA\" src=\"http://web2.conciergeauctions.com/hubfs/2017/February%20Catalogue/%20856%20Silvertip%20Heights,%20Canmore,%20AB%20Canada/856-Silvertip-Heights,-Canmore,-AB-Canada-HeroImage-3.jpg?noresize\" width=\"798\" style=\"width:798px; padding-bottom: 50px; vertical-align: bottom;\" class=\"mcnImage heroImage\">\n" +
"                                  </a>\n" +
"                                </td>\n" +
"                              </tr>\n" +
"                            </tbody>\n" +
"                          </table>\n" +
"                        </td>\n" +
"                      </tr>\n" +
"                    </tbody>\n" +
"                  </table>\n" +
"\n" +
"                  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnTextBlock\" style=\"min-width:100%;\">\n" +
"                    <tbody class=\"mcnTextBlockOuter\">\n" +
"                      <tr>\n" +
"                        <td valign=\"top\" class=\"mcnTextBlockInner\">\n" +
"\n" +
"                          <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"min-width:100%;\" class=\"mcnTextContentContainer\">\n" +
"                            <tbody>\n" +
"                              <tr>\n" +
"                                <td valign=\"top\" class=\"mcnTextContent\" style=\"padding-top:0px; padding-right: 18px; padding-left: 18px;\">\n" +
"                                  <div style=\"text-align: center;padding-bottom:10px;\" class=\"mobileTitle\"><span style=\"font-size:30px; font-family:'Lato', sans-serif; color:rgba(0, 0, 0, .87); font-weight:800; letter-spacing: 1.75px; text-transform: uppercase;\" class=\"mobileTitle\">CANMORE, ALBERTA</span></div>\n" +
"                                  <div style=\"text-align: center;\"><span style=\"font-family:'Lato', sans-serif; font-size:18px; text-transform: uppercase;\">Previously $3.5M | Selling Without Reserve</span></div>\n" +
"                                </td>\n" +
"                              </tr>\n" +
"                            </tbody>\n" +
"                          </table>\n" +
"                        </td>\n" +
"                      </tr>\n" +
"                    </tbody>\n" +
"                  </table>\n" +
"\n" +
"                  <hr style=\"margin: 15px auto; width: 30px; border: none; height: 1px; background-color: rgba(0, 0, 0, .12);\">\n" +
"\n" +
"                </td>\n" +
"              </tr>\n" +
"              <tr>\n" +
"                <td valign=\"top\" id=\"templateBody\">\n" +
"\n" +
"                  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnTextBlock\" style=\"min-width:100%;\">\n" +
"                    <tbody class=\"mcnTextBlockOuter\">\n" +
"                      <tr>\n" +
"                        <td valign=\"top\" class=\"mcnTextBlockInner\">\n" +
"\n" +
"                          <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"min-width:100%;\" class=\"mcnTextContentContainer\">\n" +
"                            <tbody>\n" +
"                              <tr>\n" +
"                                <td valign=\"top\" class=\"mcnTextContent\" style=\"padding: 0 100px 9px;\">\n" +
"                                  <div style=\"text-align: center; padding-bottom: 10px;\"><span style=\"font-size:20px; font-family:'Lato', sans-serif; color:rgba(0, 0, 0, .87); font-weight:600; letter-spacing: 1.75px;\" class=\"mobileSubTitle\">Auction Preview Event<br>Tuesday, January 24th | Noon–2 PM</span></div>\n" +
"                                  <div style=\"text-align: center; max-width: 100%;\"><span style=\"font-size:16px;color:rgba(0, 0, 0, .54);line-height:24px;font-family: 'Lato', sans-serif;\">Join us at 856 Silvertip Heights​ in Canmore to learn more about the property and the auction process.</span>\n" +
"                                    <div style=\"margin-top:35px;\">\n" +
"                                      <a href=\"http://web.conciergeauctions.com/rsvp-856-silvertip-heights-canmore-ab-canada-t1w3k9\" style=\"font-family: 'Lato', sans-serif;color:#ffffff;font-size:16px;text-decoration:none;background:#ffc107;padding:10px 30px;border-radius:2px; text-transform: uppercase; box-shadow:0 1px 6px rgba(0,0,0,0.12), 0 1px 4px rgba(0,0,0,0.12)\" target=\"_blank\">reserve your spot</a>\n" +
"                                    </div>\n" +
"                                  </div>\n" +
"                                </td>\n" +
"                              </tr>\n" +
"                            </tbody>\n" +
"                          </table>\n" +
"                        </td>\n" +
"                      </tr>\n" +
"                    </tbody>\n" +
"                  </table>\n" +
"                </td>\n" +
"              </tr>\n" +
"              <tr>\n" +
"                <td valign=\"top\" id=\"templateUpperColumns\">\n" +
"                  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnTextBlock\" style=\"min-width:100%;\">\n" +
"                    <tbody class=\"mcnTextBlockOuter\">\n" +
"                      <tr>\n" +
"                        <td valign=\"top\" class=\"mcnTextBlockInner\">\n" +
"\n" +
"                          <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"min-width:100%;\" class=\"mcnTextContentContainer\">\n" +
"                            <tbody>\n" +
"                              <tr>\n" +
"                                <td align=\"center\" valign=\"top\" id=\"templateUpperColumns\">\n" +
"                          <div class=\"sectionHeaderContainer\" style=\"width: 95%; text-align: center; border-bottom: 1px solid rgba(0,0,0,.12); line-height: 0%; margin-bottom: 50px; margin-top: 75px;\">\n" +
"                            <span class=\"sectionHeader\" style=\"font-family: 'Lato', sans-serif; font-weight: 600;text-transform: uppercase; background: white; padding: 0 10px; letter-spacing: 2px; font-size: 16px;\">additional info</span>\n" +
"                          </div>\n" +
"                        </td>\n" +
"                              </tr>\n" +
"                            </tbody>\n" +
"                          </table>\n" +
"                        </td>\n" +
"                      </tr>\n" +
"                    </tbody>\n" +
"                  </table>\n" +
"\n" +
"                </td>\n" +
"              </tr>\n" +
"              <tr>\n" +
"                <td valign=\"top\" id=\"templateUpperColumns\">\n" +
"                  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"399\" class=\"columnWrapper\">\n" +
"                    <tr>\n" +
"                      <td valign=\"top\" class=\"columnContainer icon-container\" style=\"padding-left: 40%;\">\n" +
"\n" +
"                        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnImageBlock\" style=\"min-width:100%;\">\n" +
"                          <tbody class=\"mcnImageBlockOuter\">\n" +
"                            <tr>\n" +
"                              <td valign=\"top\" style=\"\" class=\"mcnImageBlockInner\">\n" +
"\n" +
"                                <table align=\"left\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"mcnImageContentContainer\" style=\"min-width:100%;\">\n" +
"                                  <tbody>\n" +
"                                    <tr>\n" +
"                                      <td class=\"mcnImageContent\" valign=\"top\" style=\"padding-top: 0; padding-bottom: 0; text-align:center;\">\n" +
"                                        <img align=\"center\" alt=\"\" src=\"http://web2.conciergeauctions.com/hubfs/2016/Rezora/ic_openHouse.png\" width=\"100\" style=\"padding-bottom: 0; vertical-align: bottom;\">\n" +
"                                      </td>\n" +
"                                    </tr>\n" +
"                                  </tbody>\n" +
"                                </table>\n" +
"                              </td>\n" +
"                            </tr>\n" +
"                          </tbody>\n" +
"                        </table>\n" +
"\n" +
"                        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnTextBlock\" style=\"min-width:100%;\">\n" +
"                          <tbody class=\"mcnTextBlockOuter\">\n" +
"                            <tr>\n" +
"                              <td valign=\"top\" class=\"mcnTextBlockInner\">\n" +
"\n" +
"                                <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"min-width:100%;\" class=\"mcnTextContentContainer\">\n" +
"                                  <tbody>\n" +
"                                    <tr>\n" +
"\n" +
"                                      <td valign=\"top\" class=\"mcnTextContent\" style=\"padding-top:15px;padding-bottom: 50px; text-align: center; text-transform: capitalize;\">\n" +
"\n" +
"                                        <span style=\"font-size:110%\"><span style=\"font-family: 'Lato', sans-serif; font-weight: 600;\">open house</span></span>\n" +
"                                        <br/>\n" +
"                                        <span style=\"font-family: 'Lato', sans-serif;\"><span style=\"font-size:100%; color: rgba(0, 0, 0, .54);\">Thurs - Sun 1–4 PM MST <br/> &amp; by Appointment</span></span>\n" +
"                                      </td>\n" +
"                                    </tr>\n" +
"                                  </tbody>\n" +
"                                </table>\n" +
"\n" +
"                              </td>\n" +
"                            </tr>\n" +
"                          </tbody>\n" +
"                        </table>\n" +
"                      </td>\n" +
"                    </tr>\n" +
"                  </table>\n" +
"\n" +
"                  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"399\" class=\"columnWrapper\">\n" +
"                    <tr>\n" +
"                      <td valign=\"top\" class=\"columnContainer icon-container\" style=\"padding-right: 40%;\">\n" +
"\n" +
"                        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnImageBlock\" style=\"min-width:100%;\">\n" +
"                          <tbody class=\"mcnImageBlockOuter\">\n" +
"                            <tr>\n" +
"                              <td valign=\"top\" style=\"\" class=\"mcnImageBlockInner\">\n" +
"\n" +
"                                <table align=\"left\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"mcnImageContentContainer\" style=\"min-width:100%;\">\n" +
"                                  <tbody>\n" +
"                                    <tr>\n" +
"                                      <td class=\"mcnImageContent\" valign=\"top\" style=\"padding-top:0; padding-bottom: 0; text-align: center;\">\n" +
"                                        <img align=\"center\" alt=\"\" src=\"http://web2.conciergeauctions.com/hubfs/2016/Rezora/ic_bidders.png\" width=\"100\" style=\"padding-bottom: 0; vertical-align: bottom;\">\n" +
"                                      </td>\n" +
"                                    </tr>\n" +
"                                  </tbody>\n" +
"                                </table>\n" +
"                              </td>\n" +
"                            </tr>\n" +
"                          </tbody>\n" +
"                        </table>\n" +
"\n" +
"                        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnTextBlock\" style=\"min-width:100%;\">\n" +
"                          <tbody class=\"mcnTextBlockOuter\">\n" +
"                            <tr>\n" +
"                              <td valign=\"top\" class=\"mcnTextBlockInner\">\n" +
"\n" +
"                                <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"min-width:100%;\" class=\"mcnTextContentContainer\">\n" +
"                                  <tbody>\n" +
"                                    <tr>\n" +
"                                      <td valign=\"top\" align=\"center\" class=\"mcnTextContent\" style=\"padding-top:15px; padding-bottom: 50px; padding-left:2px; text-align: center; text-transform: capitalize;\">\n" +
"                                        <span style=\"font-size:110%;\"><span style=\"font-family: 'Lato', sans-serif; font-weight: 600\">auction</span></span>\n" +
"                                        <br/>\n" +
"                                        <span style=\"font-family: 'Lato', sans-serif;\"><span style=\"font-size:100%; color: rgba(0, 0, 0, .54);\"> February 9th <br> Instant Gavel App</span></span>\n" +
"                                      </td>\n" +
"                                    </tr>\n" +
"                                  </tbody>\n" +
"                                </table>\n" +
"                              </td>\n" +
"                            </tr>\n" +
"                          </tbody>\n" +
"                        </table>\n" +
"                      </td>\n" +
"                    </tr>\n" +
"                  </table>\n" +
"                </td>\n" +
"              </tr>\n" +
"\n" +
"              <tr>\n" +
"                <td valign=\"top\" id=\"templateUpperColumns\">\n" +
"                  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnTextBlock\" style=\"min-width:100%;\">\n" +
"                    <tbody class=\"mcnTextBlockOuter\">\n" +
"                      <tr>\n" +
"                        <td valign=\"top\" class=\"mcnTextBlockInner\">\n" +
"\n" +
"                          <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"min-width:100%;\" class=\"mcnTextContentContainer\">\n" +
"                            <tbody>\n" +
"                              <tr>\n" +
"                                <td align=\"center\" valign=\"top\" id=\"templateUpperColumns\">\n" +
"                                  <div class=\"sectionHeaderContainer\" style=\"width: 95%; text-align: center; border-bottom: 1px solid rgba(0,0,0,.12); line-height: 0%; margin-bottom: 25px; margin-top: 25px;\">\n" +
"                                    <span class=\"sectionHeader\" style=\"font-family: 'Lato', sans-serif; font-weight: 600;text-transform: uppercase; background: white; padding: 0 10px; letter-spacing: 2px; font-size: 16px;\">get a closer look</span>\n" +
"                                  </div>\n" +
"                                </td>\n" +
"                              </tr>\n" +
"                            </tbody>\n" +
"                          </table>\n" +
"                        </td>\n" +
"                      </tr>\n" +
"                    </tbody>\n" +
"                  </table>\n" +
"                </td>\n" +
"              </tr>\n" +
"              <tr>\n" +
"                <td valign=\"top\" id=\"templateUpperColumns\" style=\"padding-left: 18px; padding-right: 18px;\">\n" +
"\n" +
"                  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"200\" class=\"columnWrapper\">\n" +
"                    <tr>\n" +
"                      <td valign=\"top\" class=\"columnContainer\">\n" +
"\n" +
"                        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnImageBlock\" style=\"min-width:100%;\">\n" +
"                          <tbody class=\"mcnImageBlockOuter\">\n" +
"                            <tr>\n" +
"                              <td valign=\"top\" style=\"\" class=\"mcnImageBlockInner\">\n" +
"\n" +
"                                <table align=\"left\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"mcnImageContentContainer\" style=\"min-width:100%;\">\n" +
"                                  <tbody>\n" +
"                                    <tr>\n" +
"                                      <td class=\"mcnImageContent\" valign=\"top\" style=\"padding-right:1px; padding-left:2px; padding-top: 0; padding-bottom: 0; text-align:center;\">\n" +
"                                        <a href=\"https://www.conciergeauctions.com/auctions/856-silvertip-heights-canmore-alberta\" title=\"CANMORE, ALBERTA\" class=\"\" target=\"_blank\">\n" +
"                                          <img align=\"center\" alt=\"CANMORE, ALBERTA\" src=\"http://web2.conciergeauctions.com/hubfs/2017/January%20Catalogue/856%20Silvertip%20Heights,%20Canmore,%20AB%20Canada/856-Silvertip-Heights,-Canmore,-AB-Canada-Closer-Look-2.jpg?noresize\" width=\"252\" style=\"padding-bottom: 2px; vertical-align: bottom;\" class=\"mcnImage\">\n" +
"                                        </a>\n" +
"                                      </td>\n" +
"                                    </tr>\n" +
"                                  </tbody>\n" +
"                                </table>\n" +
"                              </td>\n" +
"                            </tr>\n" +
"                          </tbody>\n" +
"                        </table>\n" +
"                      </td>\n" +
"                    </tr>\n" +
"                  </table>\n" +
"\n" +
"                  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"200\" class=\"columnWrapper\">\n" +
"                    <tr>\n" +
"                      <td valign=\"top\" class=\"columnContainer\">\n" +
"\n" +
"                        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnImageBlock\" style=\"min-width:100%;\">\n" +
"                          <tbody class=\"mcnImageBlockOuter\">\n" +
"                            <tr>\n" +
"                              <td valign=\"top\" style=\"\" class=\"mcnImageBlockInner\">\n" +
"\n" +
"                                <table align=\"left\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"mcnImageContentContainer\" style=\"min-width:100%;\">\n" +
"                                  <tbody>\n" +
"                                    <tr>\n" +
"                                      <td class=\"mcnImageContent\" valign=\"top\" style=\"padding-right:2px; padding-left:1px; padding-top: 0; padding-bottom: 0; text-align:center;\">\n" +
"                                        <a href=\"https://www.conciergeauctions.com/auctions/856-silvertip-heights-canmore-alberta\"  class=\"\" target=\"_blank\" title=\"CANMORE, ALBERTA\">\n" +
"                                          <img align=\"center\" alt=\"CANMORE, ALBERTA\" src=\"http://web2.conciergeauctions.com/hubfs/2017/February%20Catalogue/%20856%20Silvertip%20Heights,%20Canmore,%20AB%20Canada/856-Silvertip-Heights,-Canmore,-AB-Canada-Closer-Look-5.jpg?noresize\" width=\"252\" style=\"padding-bottom: 2px; vertical-align: bottom;\" class=\"mcnImage\">\n" +
"                                        </a>\n" +
"                                      </td>\n" +
"                                    </tr>\n" +
"                                  </tbody>\n" +
"                                </table>\n" +
"                              </td>\n" +
"                            </tr>\n" +
"                          </tbody>\n" +
"                        </table>\n" +
"                      </td>\n" +
"                    </tr>\n" +
"                  </table>\n" +
"\n" +
"                  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"200\" class=\"columnWrapper\">\n" +
"                    <tr>\n" +
"                      <td valign=\"top\" class=\"columnContainer\">\n" +
"\n" +
"                        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnImageBlock\" style=\"min-width:100%;\">\n" +
"                          <tbody class=\"mcnImageBlockOuter\">\n" +
"                            <tr>\n" +
"                              <td valign=\"top\" style=\"\" class=\"mcnImageBlockInner\">\n" +
"\n" +
"                                <table align=\"left\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"mcnImageContentContainer\" style=\"min-width:100%;\">\n" +
"                                  <tbody>\n" +
"                                    <tr>\n" +
"                                      <td class=\"mcnImageContent\" valign=\"top\" style=\"padding-top:0; padding-bottom: 0; text-align: center;\">\n" +
"                                        <a href=\"https://www.conciergeauctions.com/auctions/856-silvertip-heights-canmore-alberta\" title=\"CANMORE, ALBERTA\" class=\"\" target=\"_blank\">\n" +
"                                          <img align=\"center\" alt=\"CANMORE, ALBERTA\" src=\"http://web2.conciergeauctions.com/hubfs/2017/February%20Catalogue/%20856%20Silvertip%20Heights,%20Canmore,%20AB%20Canada/856-Silvertip-Heights,-Canmore,-AB-Canada-Closer-Look-6.jpg?noresize\" width=\"252\" style=\"padding-bottom: 2px; vertical-align: bottom;\" class=\"mcnImage\">\n" +
"                                        </a>\n" +
"                                      </td>\n" +
"                                    </tr>\n" +
"                                  </tbody>\n" +
"                                </table>\n" +
"                              </td>\n" +
"                            </tr>\n" +
"                          </tbody>\n" +
"                        </table>\n" +
"                      </td>\n" +
"                    </tr>\n" +
"                  </table>\n" +
"                </td>\n" +
"              </tr>\n" +
"              <tr>\n" +
"                <td style=\"text-align: center; font-size:16px; background-color: #fff; color:rgba(0, 0, 0, .54);line-height:24px;font-family: 'Lato', sans-serif; padding: 20px 24px 40px;\">\n" +
"                  <span>Appraised at over $4 million, this contemporary estate in Canmore’s world-class Silvertip golf resort is a unique investment opportunity for a smart buyer. </span>\n" +
"                  <div style=\"margin-top:35px;\">\n" +
"                    <a href=\"https://www.conciergeauctions.com/auctions/856-silvertip-heights-canmore-alberta\" style=\"font-family: 'Lato', sans-serif;color:#ffffff;font-size:16px;text-decoration:none;background:#03a9f4;padding:10px 30px;border-radius:2px; text-transform: uppercase; box-shadow:0 1px 6px rgba(0,0,0,0.12), 0 1px 4px rgba(0,0,0,0.12)\" target=\"_blank\">explore now</a>\n" +
"                  </div>\n" +
"                </td>\n" +
"              </tr>\n" +
"            </table>\n" +
"            <tr>\n" +
"              <td valign=\"top\" id=\"templateFooter\" align=\"center\">\n" +
"                <hr style=\"margin: 10px auto 25px; max-width: 800px; border: none; height: 1px; background-color: rgba(0, 0, 0, .12);\" id=\"horizontalRule\">\n" +
"\n" +
"                <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"mcnFollowBlock\" style=\"max-width: 800px; display: inline-block;\">\n" +
"                  <tbody class=\"mcnFollowBlockOuter\">\n" +
"                    <tr>\n" +
"                      <td align=\"center\" valign=\"top\" class=\"mcnFollowBlockInner\">\n" +
"\n" +
"                        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnFollowContentContainer\">\n" +
"                          <tbody>\n" +
"                            <tr>\n" +
"                              <td>\n" +
"\n" +
"                                <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"min-width:100%;\" class=\"mcnFollowContent\">\n" +
"                                  <tbody>\n" +
"                                    <tr>\n" +
"                                      <td align=\"center\" valign=\"top\">\n" +
"                                        <div style=\"display: inline-block\">\n" +
"                                          <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
"                                            <tbody>\n" +
"                                              <tr>\n" +
"                                                <td align=\"center\" valign=\"top\" style=\"border-right: 1px solid rgba(0,0,0,.12); padding-right: 50px;\" class=\"socialPane\">\n" +
"                                                  <div style=\"text-align: center;\"><span style=\"font-size:15px; font-family: 'Lato', sans-serif; font-weight:600; letter-spacing: 1.25px; text-transform: uppercase; line-height: 22px;\"><span class=\"shortDescription\">stay in the know</span>\n" +
"                                                    <br/>follow us on social</span>\n" +
"                                                    <br/>\n" +
"                                                  </div>\n" +
"\n" +
"                                                  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\"  style=\"display:inline; padding-top: 15px;\" class=\"socialIcons\">\n" +
"                                                    <tbody>\n" +
"                                                      <tr>\n" +
"                                                        <td valign=\"top\" class=\"mcnFollowContentItemContainer\">\n" +
"\n" +
"                                                          <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnFollowContentItem\">\n" +
"                                                            <tbody>\n" +
"                                                              <tr>\n" +
"                                                                <td align=\"left\" valign=\"middle\" style=\"padding: 5px 7px;\" class=\"socialIcon\">\n" +
"\n" +
"                                                                  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
"                                                                    <tbody>\n" +
"                                                                      <tr>\n" +
"                                                                        <td align=\"center\" valign=\"middle\" width=\"30\" class=\"mcnFollowIconContent\">\n" +
"                                                                          <a href=\"http://www.facebook.com/ConciergeAuctions\" target=\"_blank\"><img src=\"https://cdn-images.mailchimp.com/icons/social-block-v2/dark-facebook-48.png\" style=\"display:block;\" width=\"30\"></a>\n" +
"                                                                        </td>\n" +
"                                                                      </tr>\n" +
"                                                                    </tbody>\n" +
"                                                                  </table>\n" +
"                                                                </td>\n" +
"                                                              </tr>\n" +
"                                                            </tbody>\n" +
"                                                          </table>\n" +
"                                                        </td>\n" +
"                                                      </tr>\n" +
"                                                    </tbody>\n" +
"                                                  </table>\n" +
"\n" +
"                                                  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"display:inline; padding-top: 15px;\" class=\"socialIcons\">\n" +
"                                                    <tbody>\n" +
"                                                      <tr>\n" +
"                                                        <td valign=\"top\" class=\"mcnFollowContentItemContainer\">\n" +
"\n" +
"                                                          <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnFollowContentItem\">\n" +
"                                                            <tbody>\n" +
"                                                              <tr>\n" +
"                                                                <td align=\"left\" valign=\"middle\" style=\"padding: 5px 7px;\" class=\"socialIcon\">\n" +
"\n" +
"                                                                  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
"                                                                    <tbody>\n" +
"                                                                      <tr>\n" +
"                                                                        <td align=\"center\" valign=\"middle\" width=\"30\" class=\"mcnFollowIconContent\">\n" +
"                                                                          <a href=\"http://www.youtube.com/user/ConciergeAuctions\" target=\"_blank\"><img src=\"https://cdn-images.mailchimp.com/icons/social-block-v2/dark-youtube-48.png\" style=\"display:block;\" width=\"30\"></a>\n" +
"                                                                        </td>\n" +
"                                                                      </tr>\n" +
"                                                                    </tbody>\n" +
"                                                                  </table>\n" +
"                                                                </td>\n" +
"                                                              </tr>\n" +
"                                                            </tbody>\n" +
"                                                          </table>\n" +
"                                                        </td>\n" +
"                                                      </tr>\n" +
"                                                    </tbody>\n" +
"                                                  </table>\n" +
"\n" +
"                                                  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"display:inline; padding-top: 15px;\" class=\"socialIcons\">\n" +
"                                                    <tbody>\n" +
"                                                      <tr>\n" +
"                                                        <td valign=\"top\" class=\"mcnFollowContentItemContainer\">\n" +
"\n" +
"                                                          <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnFollowContentItem\">\n" +
"                                                            <tbody>\n" +
"                                                              <tr>\n" +
"                                                                <td align=\"left\" valign=\"middle\" style=\"padding: 5px 7px;\" class=\"socialIcon\">\n" +
"\n" +
"                                                                  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
"                                                                    <tbody>\n" +
"                                                                      <tr>\n" +
"                                                                        <td align=\"center\" valign=\"middle\" width=\"30\" class=\"mcnFollowIconContent\">\n" +
"                                                                          <a href=\"https://plus.google.com/114233341720328809458/posts\" target=\"_blank\"><img src=\"https://cdn-images.mailchimp.com/icons/social-block-v2/dark-googleplus-48.png\" style=\"display:block;\" width=\"30\"></a>\n" +
"                                                                        </td>\n" +
"                                                                      </tr>\n" +
"                                                                    </tbody>\n" +
"                                                                  </table>\n" +
"                                                                </td>\n" +
"                                                              </tr>\n" +
"                                                            </tbody>\n" +
"                                                          </table>\n" +
"                                                        </td>\n" +
"                                                      </tr>\n" +
"                                                    </tbody>\n" +
"                                                  </table>\n" +
"\n" +
"                                                  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"display:inline; padding-top: 15px;\" class=\"socialIcons\">\n" +
"                                                    <tbody>\n" +
"                                                      <tr>\n" +
"                                                        <td valign=\"top\" class=\"mcnFollowContentItemContainer\">\n" +
"\n" +
"                                                          <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnFollowContentItem\">\n" +
"                                                            <tbody>\n" +
"                                                              <tr>\n" +
"                                                                <td align=\"left\" valign=\"middle\" style=\"padding: 5px 7px;\" class=\"socialIcon\">\n" +
"\n" +
"                                                                  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
"                                                                    <tbody>\n" +
"                                                                      <tr>\n" +
"                                                                        <td align=\"center\" valign=\"middle\" width=\"30\" class=\"mcnFollowIconContent\">\n" +
"                                                                          <a href=\"http://www.linkedin.com/company/368298\" target=\"_blank\"><img src=\"https://cdn-images.mailchimp.com/icons/social-block-v2/dark-linkedin-48.png\" style=\"display:block;\" width=\"30\"></a>\n" +
"                                                                        </td>\n" +
"                                                                      </tr>\n" +
"                                                                    </tbody>\n" +
"                                                                  </table>\n" +
"                                                                </td>\n" +
"                                                              </tr>\n" +
"                                                            </tbody>\n" +
"                                                          </table>\n" +
"                                                        </td>\n" +
"                                                      </tr>\n" +
"                                                    </tbody>\n" +
"                                                  </table>\n" +
"\n" +
"                                                  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"display:inline; padding-top: 15px;\" class=\"socialIcons\">\n" +
"                                                    <tbody>\n" +
"                                                      <tr>\n" +
"                                                        <td valign=\"top\" class=\"mcnFollowContentItemContainer\">\n" +
"\n" +
"                                                          <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnFollowContentItem\">\n" +
"                                                            <tbody>\n" +
"                                                              <tr>\n" +
"                                                                <td align=\"left\" valign=\"middle\" style=\"padding: 5px 7px;\" class=\"socialIcon\">\n" +
"\n" +
"                                                                  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
"                                                                    <tbody>\n" +
"                                                                      <tr>\n" +
"                                                                        <td align=\"center\" valign=\"middle\" width=\"30\" class=\"mcnFollowIconContent\">\n" +
"                                                                          <a href=\"http://pinterest.com/conciergeluxury/\" target=\"_blank\"><img src=\"https://cdn-images.mailchimp.com/icons/social-block-v2/dark-pinterest-48.png\" style=\"display:block;\" width=\"30\"></a>\n" +
"                                                                        </td>\n" +
"                                                                      </tr>\n" +
"                                                                    </tbody>\n" +
"                                                                  </table>\n" +
"                                                                </td>\n" +
"                                                              </tr>\n" +
"                                                            </tbody>\n" +
"                                                          </table>\n" +
"                                                        </td>\n" +
"                                                      </tr>\n" +
"                                                    </tbody>\n" +
"                                                  </table>\n" +
"\n" +
"                                                  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"display:inline; padding-top: 15px;\" class=\"socialIcons\" id=\"lastSocial\">\n" +
"                                                    <tbody>\n" +
"                                                      <tr>\n" +
"                                                        <td valign=\"top\" style=\"padding-right:0; padding-bottom:9px;\" class=\"mcnFollowContentItemContainer\">\n" +
"\n" +
"                                                          <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnFollowContentItem\">\n" +
"                                                            <tbody>\n" +
"                                                              <tr>\n" +
"                                                                <td align=\"left\" valign=\"middle\" style=\"padding: 5px 7px;\" class=\"socialIcon\">\n" +
"\n" +
"                                                                  <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
"                                                                    <tbody>\n" +
"                                                                      <tr>\n" +
"                                                                        <td align=\"center\" valign=\"middle\" width=\"30\" class=\"mcnFollowIconContent\">\n" +
"                                                                          <a href=\"http://instagram.com/conciergeauctions\" target=\"_blank\"><img src=\"https://cdn-images.mailchimp.com/icons/social-block-v2/dark-instagram-48.png\" style=\"display:block;\" width=\"30\"></a>\n" +
"                                                                        </td>\n" +
"                                                                      </tr>\n" +
"                                                                    </tbody>\n" +
"                                                                  </table>\n" +
"                                                                </td>\n" +
"                                                              </tr>\n" +
"                                                            </tbody>\n" +
"                                                          </table>\n" +
"                                                        </td>\n" +
"                                                      </tr>\n" +
"                                                    </tbody>\n" +
"                                                  </table>\n" +
"                                                </td>\n" +
"                                              </tr>\n" +
"                                            </tbody>\n" +
"                                          </table>\n" +
"                                        </div>\n" +
"                                        <div style=\"display: inline-block\">\n" +
"                                          <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
"                                            <tbody>\n" +
"                                              <tr>\n" +
"                                                <td align=\"center\" valign=\"top\" style=\"padding-left: 50px;\" class=\"socialPane\">\n" +
"                                                  <div style=\"text-align: center; padding-bottom:10px;\"><span style=\"font-size:15px; font-family: 'Lato', sans-serif; font-weight:600; letter-spacing: 1.25px; text-transform: uppercase; line-height: 22px;\"><span class=\"shortDescription\">bid &amp; watch auctions live</span>\n" +
"                                                    <br/>download our <i>instant gavel</i> app</span>\n" +
"                                                    <br/>\n" +
"                                                    <a href=\"https://itunes.apple.com/us/app/instant-gavel/id979968478?mt=8\" target=\"_blank\"><img src=\"http://web2.conciergeauctions.com/hubfs/2016/Rezora/ic_appleAppStore.png\" style=\"display:inline-block; margin-right: 10px; margin-top: 18px;\" width=\"110\"></a>\n" +
"                                                    <a href=\"https://play.google.com/store/apps/details?id=com.bidwrangler.conciergeauctions\" target=\"_blank\"><img src=\"http://web2.conciergeauctions.com/hubfs/2016/Rezora/ic_googleStore.png\" style=\"display:inline-block; margin-top: 18px;\" width=\"110\"></a>\n" +
"                                                  </div>\n" +
"                                                </td>\n" +
"                                              </tr>\n" +
"                                            </tbody>\n" +
"                                          </table>\n" +
"                                        </div>\n" +
"                                      </td>\n" +
"                                    </tr>\n" +
"                                  </tbody>\n" +
"                                </table>\n" +
"                              </td>\n" +
"                            </tr>\n" +
"                          </tbody>\n" +
"                        </table>\n" +
"                      </td>\n" +
"                    </tr>\n" +
"                  </tbody>\n" +
"                </table>\n" +
"\n" +
"                <hr style=\"margin: 15px auto 25px; max-width: 800px; border: none; height: 1px; background-color: rgba(0, 0, 0, .12);\">\n" +
"\n" +
"                <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnTextBlock\" style=\"min-width:100%;\">\n" +
"                  <tbody class=\"mcnTextBlockOuter\">\n" +
"                    <tr>\n" +
"                      <td align=\"center\" valign=\"top\" class=\"mcnTextBlockInner\">\n" +
"\n" +
"                        <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"max-width: 800px;\" class=\"mcnTextContentContainer\">\n" +
"                          <tbody>\n" +
"                            <tr>\n" +
"                              <td align=\"center\" valign=\"top\" class=\"mcnTextContent\">\n" +
"                                <p id=\"footer\" style=\"font-family: Lato, Geneva, Verdana, Arial, Helvetica, sans-serif; text-align: center; font-size: 12px; line-height: 1em; display: block; padding: 0 50px 0 50px;\"><span style=\"font-size: 10px; color: rgba(0, 0, 0, .54);\">{{site_settings.company_name}}, {{site_settings.company_street_address_1}} {{site_settings.company_street_address_2}}, {{site_settings.company_city}}, {{site_settings.company_state}} {{site_settings.company_zip}} {{site_settings.company_country}} </span>\n" +
"                                  <br/>\n" +
"                                  <br/><span style=\"font-size: 10px; color: rgba(0, 0, 0, .54);\"> You received this email because you are subscribed to {{ subscription_name }} from {{site_settings.company_name}}. </span>\n" +
"                                  <br/>\n" +
"                                  <br/><span style=\"font-size: 10px; color: rgba(0, 0, 0, .54);\"> Update your <a target=\"_blank\" href=\"{{ unsubscribe_link }}\" style=\"text-decoration: underline; whitespace: nowrap; color:rgba(0, 0, 0, .54);\" data-unsubscribe=\"true\">email preferences</a> to choose the types of emails you receive. </span>\n" +
"                                  <br/>\n" +
"                                  <br/><span style=\"font-size: 10px; color: rgba(0, 0, 0, .54);\"> &nbsp;<a target=\"_blank\" href=\"{{ unsubscribe_link_all }}\" style=\"text-decoration: underline; whitespace: nowrap; color:rgba(0, 0, 0, .54);\" data-unsubscribe=\"true\">Unsubscribe from all future emails</a>&nbsp;</span><span style=\"color: rgba(0, 0, 0, .54);\">| </span><a href=\"http://web2.conciergeauctions.com/hubfs/2017/February%20Catalogue/%20856%20Silvertip%20Heights,%20Canmore,%20AB%20Canada/856-Silvertip-Heights,-Canmore,-AB-Canada-Disclaimer.jpg\" style=\"text-decoration: underline; whitespace: nowrap; font-size:10px; color:rgba(0, 0, 0, .54);\" target=\"_blank\">Disclaimer</a></p>\n" +
"                              </td>\n" +
"                            </tr>\n" +
"                          </tbody>\n" +
"                        </table>\n" +
"                      </td>\n" +
"                    </tr>\n" +
"                  </tbody>\n" +
"                </table>\n" +
"              </td>\n" +
"            </tr>\n" +
"          </table>\n" +
"        </td>\n" +
"      </tr>\n" +
"    </table>\n" +
"  </center>\n" +
"</body>\n" +
"</html>";
String html1 = html.replaceAll("CANMORE, ALBERTA",propertyname);
String html2 = html1.replaceAll("https://www.conciergeauctions.com/auctions/856-silvertip-heights-canmore-alberta",URL);
String html3=html2.replace("Appraised at over $4 million, this contemporary estate in Canmore’s world-class Silvertip golf resort is a unique investment opportunity for a smart buyer. \n" +
"\n" +
" <br><br><i>\n" +
"                                      Bid via Instant Gavel</i>", bodytext);
String html4=html3.replace("http://web2.conciergeauctions.com/hubfs/2017/January%20Catalogue/856%20Silvertip%20Heights,%20Canmore,%20AB%20Canada/856-Silvertip-Heights,-Canmore,-AB-Canada-Disclaimer.jpg",disclamier);
String html5=html4.replace("http://web2.conciergeauctions.com/hubfs/2017/January%20Catalogue/856%20Silvertip%20Heights,%20Canmore,%20AB%20Canada/856-Silvertip-Heights,-Canmore,-AB-Canada-Closer-Look-2.jpg",img1url);
String html6=html5.replace("http://web2.conciergeauctions.com/hubfs/2017/January%20Catalogue/856%20Silvertip%20Heights,%20Canmore,%20AB%20Canada/856-Silvertip-Heights,-Canmore,-AB-Canada-Closer-Look-1.jpg",img2url);
String html7=html6.replace("http://web2.conciergeauctions.com/hubfs/2017/January%20Catalogue/856%20Silvertip%20Heights,%20Canmore,%20AB%20Canada/856-Silvertip-Heights,-Canmore,-AB-Canada-Closer-Look-4.jpg",img3url);
String html8=html7.replace("http://web2.conciergeauctions.com/hubfs/2017/January%20Catalogue/856%20Silvertip%20Heights,%20Canmore,%20AB%20Canada/856-Silvertip-Heights,-Canmore,-AB-Canada-HeroImage-2.jpg", herourl);
String html9=html8.replace("February 9th",auctiondate);

String html10=html9.replace(" Thurs-Sun 1-4pm<br>by Appointment",openhouse);
String finalhtml=html10.replace("Previously $3.5M | Selling Without Reserve",sellingprice);

return finalhtml;
      
    }
 public static String returnImpEmailHTML(String[] args) {
        // TODO code application logic here
         String propertyname=args[0];    
         
         String url=args[1]; //title
         
         String location=args[2];
        
         String registerdate=args[3];
          
         String auctiondate=args[4];
        
         String psm=args[5];
         
         String title=args[6];
         
         String email= args[7];
        
         String phone=args[8];
         
         String disclamier= args[9];
     
        
         
              String html="<!doctype html>\n" +
"<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\">\n" +
"\n" +
"<head>\n" +
"  <!-- NAME: 1:3:2 COLUMN -->\n" +
"  <!--[if gte mso 15]>\n" +
"        <xml>\n" +
"            <o:OfficeDocumentSettings>\n" +
"            <o:AllowPNG/>\n" +
"            <o:PixelsPerInch>96</o:PixelsPerInch>\n" +
"            </o:OfficeDocumentSettings>\n" +
"        </xml>\n" +
"        <![endif]-->\n" +
"  <meta charset=\"UTF-8\">\n" +
"  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
"  <title>*|MC:SUBJECT|*</title>\n" +
"  <!-- Added by Hubspot 3/2/16 -->\n" +
"  <!-- Preview text (text which appears right after subject) -->\n" +
"  <div id=\"preview_text\" style=\"display:none!important\">\n" +
"    {% text \"preview_text\" label=\"Preview Text <span class=help-text>This will be used as the preview text that displays in some email clients</span>\", value=\"\", no_wrapper=True %}\n" +
"  </div>\n" +
"\n" +
"  <link href='https://fonts.googleapis.com/css?family=Lato:400,700,900' rel='stylesheet' type='text/css'>\n" +
"  <!-- font-family: 'Lato', sans-serif; -->\n" +
"  <style type=\"text/css\">\n" +
"    p {\n" +
"      margin: 10px 0;\n" +
"      padding: 0;\n" +
"    }\n" +
"    \n" +
"    table {\n" +
"      border-collapse: collapse;\n" +
"    }\n" +
"    /*Added by Hubspot 3/2/16*/\n" +
"    /* Hide preview text on rendering */\n" +
"    \n" +
"    #preview_text {\n" +
"      display: none;\n" +
"    }\n" +
"    \n" +
"    img,\n" +
"    a img {\n" +
"      border: 0;\n" +
"      height: auto;\n" +
"      outline: none;\n" +
"      text-decoration: none;\n" +
"    }\n" +
"    \n" +
"    body,\n" +
"    #bodyTable,\n" +
"    #bodyCell {\n" +
"      height: 100%;\n" +
"      margin: 0;\n" +
"      padding: 0;\n" +
"      width: 100%;\n" +
"    }\n" +
"    \n" +
"    img {\n" +
"      -ms-interpolation-mode: bicubic;\n" +
"    }\n" +
"    \n" +
"    table {\n" +
"      mso-table-lspace: 0pt;\n" +
"      mso-table-rspace: 0pt;\n" +
"    }\n" +
"    \n" +
"    p,\n" +
"    a,\n" +
"    li,\n" +
"    td,\n" +
"    blockquote {\n" +
"      mso-line-height-rule: exactly;\n" +
"    }\n" +
"    \n" +
"    a[href^=tel],\n" +
"    a[href^=sms] {\n" +
"      color: inherit;\n" +
"      cursor: default;\n" +
"      text-decoration: none;\n" +
"    }\n" +
"    \n" +
"    p,\n" +
"    a,\n" +
"    li,\n" +
"    td,\n" +
"    body,\n" +
"    table,\n" +
"    blockquote {\n" +
"      -ms-text-size-adjust: 100%;\n" +
"      -webkit-text-size-adjust: 100%;\n" +
"    }\n" +
"    \n" +
"    a[x-apple-data-detectors] {\n" +
"      color: inherit !important;\n" +
"      text-decoration: none !important;\n" +
"      font-size: inherit !important;\n" +
"      font-family: inherit !important;\n" +
"      font-weight: inherit !important;\n" +
"      line-height: inherit !important;\n" +
"    }\n" +
"    \n" +
"    #bodyCell {\n" +
"      padding: 10px;\n" +
"    }\n" +
"    \n" +
"    a.mcnButton {\n" +
"      display: block;\n" +
"    }\n" +
"    \n" +
"    .mcnImage {\n" +
"      vertical-align: bottom;\n" +
"    }\n" +
"    \n" +
"    .mcnTextContent {\n" +
"      word-break: break-word;\n" +
"    }\n" +
"    \n" +
"    .mcnTextContent img {\n" +
"      height: auto !important;\n" +
"    }\n" +
"    \n" +
"    body,\n" +
"    #bodyTable {\n" +
"      background-color: #f9f9f9;\n" +
"      color: rgba(0, 0, 0, .87);\n" +
"    }\n" +
"    \n" +
"    #bodyCell {\n" +
"      border-top: 0;\n" +
"    }\n" +
"    \n" +
"    .templateContainer {\n" +
"      border: 0;\n" +
"    }\n" +
"    \n" +
"    #templatePreheader {\n" +
"      background-color: #F9F9F9;\n" +
"      border-top: 0;\n" +
"      border-bottom: 0;\n" +
"      padding-top: 0px;\n" +
"      padding-bottom: 0px;\n" +
"    }\n" +
"    \n" +
"    #templatePreheader .mcnTextContent,\n" +
"    #templatePreheader .mcnTextContent p {\n" +
"      color: rgba(0, 0, 0, .87);\n" +
"      font-family: lato;\n" +
"      font-size: 12px;\n" +
"      line-height: 150%;\n" +
"      text-align: left;\n" +
"    }\n" +
"    \n" +
"    #templatePreheader .mcnTextContent a,\n" +
"    #templatePreheader .mcnTextContent p a {\n" +
"      color: rgba(0, 0, 0, .87);\n" +
"      font-weight: normal;\n" +
"      text-decoration: underline;\n" +
"    }\n" +
"    \n" +
"    #templateHeader {\n" +
"      background-color: #FFFFFF;\n" +
"      border-top: 0;\n" +
"      border-bottom: 0;\n" +
"      padding-top: 30px;\n" +
"      padding-bottom: 0;\n" +
"    }\n" +
"    \n" +
"    #templateHeader .mcnTextContent,\n" +
"    #templateHeader .mcnTextContent p {\n" +
"      color: rgba(0, 0, 0, .87);\n" +
"      font-family: lato;\n" +
"      font-size: 16px;\n" +
"      line-height: 150%;\n" +
"      text-align: left;\n" +
"    }\n" +
"    \n" +
"    #templateHeader .mcnTextContent a,\n" +
"    #templateHeader .mcnTextContent p a {\n" +
"      font-weight: normal;\n" +
"      text-decoration: underline;\n" +
"    }\n" +
"    \n" +
"    #templateBody {\n" +
"      background-color: #FFFFFF;\n" +
"      border-top: 0;\n" +
"      border-bottom: 0;\n" +
"      padding-top: 0;\n" +
"      padding-bottom: 0;\n" +
"    }\n" +
"    \n" +
"    #templateBody .mcnTextContent,\n" +
"    #templateBody .mcnTextContent p {\n" +
"      color: rgba(0, 0, 0, .87);\n" +
"      font-family: lato;\n" +
"      font-size: 16px;\n" +
"      line-height: 150%;\n" +
"      text-align: left;\n" +
"    }\n" +
"    \n" +
"    #templateBody .mcnTextContent a,\n" +
"    #templateBody .mcnTextContent p a {\n" +
"      font-weight: normal;\n" +
"      text-decoration: underline;\n" +
"    }\n" +
"    \n" +
"    #templateUpperColumns {\n" +
"      background-color: #FFFFFF;\n" +
"      border-top: 0;\n" +
"      border-bottom: 0;\n" +
"      padding-top: 0;\n" +
"      padding-bottom: 0;\n" +
"    }\n" +
"    \n" +
"    #templateUpperColumns .columnContainer .mcnTextContent,\n" +
"    #templateUpperColumns .columnContainer .mcnTextContent p {\n" +
"      color: rgba(0, 0, 0, .87);\n" +
"      font-family: lato;\n" +
"      font-size: 16px;\n" +
"      line-height: 150%;\n" +
"      text-align: center;\n" +
"    }\n" +
"    \n" +
"    #templateUpperColumns .columnContainer .mcnTextContent a,\n" +
"    #templateUpperColumns .columnContainer .mcnTextContent p a {\n" +
"      font-weight: normal;\n" +
"      text-decoration: underline;\n" +
"    }\n" +
"    \n" +
"    #templateLowerColumns {\n" +
"      background-color: #FFFFFF;\n" +
"      border-top: 0;\n" +
"      padding-top: 0;\n" +
"      padding-bottom: 0px;\n" +
"    }\n" +
"    \n" +
"    #templateLowerColumns .columnContainer .mcnTextContent,\n" +
"    #templateLowerColumns .columnContainer .mcnTextContent p {\n" +
"      color: rgba(0, 0, 0, .87);\n" +
"      font-family: lato;\n" +
"      font-size: 16px;\n" +
"      line-height: 150%;\n" +
"      text-align: left;\n" +
"    }\n" +
"    \n" +
"    #templateLowerColumns .columnContainer .mcnTextContent a,\n" +
"    #templateLowerColumns .columnContainer .mcnTextContent p a {\n" +
"      font-weight: normal;\n" +
"      text-decoration: underline;\n" +
"    }\n" +
"    \n" +
"    #templateFooter {\n" +
"      background-color: #FAFAFA;\n" +
"      border-top: 0;\n" +
"      border-bottom: 0;\n" +
"      padding-top: 9px;\n" +
"      padding-bottom: 9px;\n" +
"    }\n" +
"    \n" +
"    #templateFooter .mcnTextContent,\n" +
"    #templateFooter .mcnTextContent p {\n" +
"      color: rgba(0, 0, 0, .87);\n" +
"      font-family: lato;\n" +
"      font-size: 12px;\n" +
"      line-height: 150%;\n" +
"      text-align: center;\n" +
"    }\n" +
"    \n" +
"    #templateFooter .mcnTextContent a,\n" +
"    #templateFooter .mcnTextContent p a {\n" +
"      color: rgba(0, 0, 0, .87);\n" +
"      font-weight: normal;\n" +
"      text-decoration: underline;\n" +
"    }\n" +
"    \n" +
"    .properties li:last-child span:last-child {\n" +
"      padding-bottom: 0 !important;\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      body,\n" +
"      table,\n" +
"      td,\n" +
"      p,\n" +
"      a,\n" +
"      li,\n" +
"      blockquote {\n" +
"        -webkit-text-size-adjust: none !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      #bodyCell {\n" +
"        padding-top: 10px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .columnWrapper {\n" +
"        max-width: 100% !important;\n" +
"        width: 100% !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcnImage {\n" +
"        width: 95% !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mobileTitle {\n" +
"        font-size: 28px !important;\n" +
"        padding-bottom: 10px !important;\n" +
"        line-height: 35px;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .menu-container {\n" +
"        padding-top: 10px !important;\n" +
"        padding-bottom: 10px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 374px) and (min-width: 320px) {\n" +
"      .menu-items {\n" +
"        font-size: 10px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) and (min-width: 375px) {\n" +
"      .menu-items {\n" +
"        font-size: 12px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .menu-item {\n" +
"        padding-right: 10px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mobileCatalogText {\n" +
"        padding-left: 0px !important;\n" +
"        padding-right: 0px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .companyLogo {\n" +
"        width: 250px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcnCaptionTopContent,\n" +
"      .mcnTextContentContainer,\n" +
"      .mcnBoxedTextContentContainer {\n" +
"        max-width: 100% !important;\n" +
"        width: 100% !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcnImageBlockInner,\n" +
"      .mcnImageContent {\n" +
"        padding: 0px 6px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcnTextContent {\n" +
"        padding-right: 24px !important;\n" +
"        padding-left: 24px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mobileHeader {\n" +
"        padding: 0 !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcnBoxedTextContentContainer {\n" +
"        min-width: 100% !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcnImageGroupContent {\n" +
"        padding: 9px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcnCaptionLeftContentOuter .mcnTextContent,\n" +
"      .mcnCaptionRightContentOuter .mcnTextContent {\n" +
"        padding-top: 9px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcnImageCardTopImageContent,\n" +
"      .mcnCaptionBlockInner .mcnCaptionTopContent:last-child .mcnTextContent {\n" +
"        padding-top: 18px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcnImageCardBottomImageContent {\n" +
"        padding-bottom: 9px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcnImageGroupBlockInner {\n" +
"        padding-top: 0 !important;\n" +
"        padding-bottom: 0 !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcnImageGroupBlockOuter {\n" +
"        padding-top: 9px !important;\n" +
"        padding-bottom: 9px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcnImageCardLeftImageContent,\n" +
"      .mcnImageCardRightImageContent {\n" +
"        padding-right: 18px !important;\n" +
"        padding-bottom: 0 !important;\n" +
"        padding-left: 18px !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcpreview-image-uploader {\n" +
"        display: none !important;\n" +
"        width: 100% !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mcnBoxedTextContentContainer .mcnTextContent,\n" +
"      .mcnBoxedTextContentContainer .mcnTextContent p {\n" +
"        font-size: 14px !important;\n" +
"        line-height: 150% !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      #templatePreheader {\n" +
"        display: block !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      #templatePreheader .mcnTextContent,\n" +
"      #templatePreheader .mcnTextContent p {\n" +
"        font-size: 14px !important;\n" +
"        line-height: 150% !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      #templateHeader .mcnTextContent,\n" +
"      #templateHeader .mcnTextContent p {\n" +
"        font-size: 16px !important;\n" +
"        line-height: 150% !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      #templateBody .mcnTextContent,\n" +
"      #templateBody .mcnTextContent p {\n" +
"        font-size: 16px !important;\n" +
"        line-height: 150% !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      #templateUpperColumns .columnContainer .mcnTextContent,\n" +
"      #templateUpperColumns .columnContainer .mcnTextContent p {\n" +
"        font-size: 16px !important;\n" +
"        line-height: 150% !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      #templateLowerColumns .columnContainer .mcnTextContent,\n" +
"      #templateLowerColumns .columnContainer .mcnTextContent p {\n" +
"        font-size: 16px !important;\n" +
"        line-height: 150% !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      #templateFooter .mcnTextContent,\n" +
"      #templateFooter .mcnTextContent p {\n" +
"        font-size: 14px !important;\n" +
"        line-height: 125% !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    .mobileHeader {\n" +
"      min-width: 798px !important;\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .mobileHeader {\n" +
"        min-width: 0 !important;\n" +
"      }\n" +
"    }\n" +
"    \n" +
"    @media only screen and (max-width: 480px) {\n" +
"      .socialPane {\n" +
"        border-right: none !important;\n" +
"        padding-right: 0 !important;\n" +
"        padding-left: 0 !important;\n" +
"      }\n" +
"      .mcnFollowContentItemContainer {\n" +
"        padding-bottom: 10px !important;\n" +
"      }\n" +
"      #lastSocial {\n" +
"        padding-right: 0 !important;\n" +
"      }\n" +
"      .shortDescription {\n" +
"        display: none !important;\n" +
"      }\n" +
"      .socialIcons {\n" +
"        padding-top: 14px !important;\n" +
"      }\n" +
"      #horizontalRule {\n" +
"        margin-bottom: 15px !important;\n" +
"      }\n" +
"      .icon-container {\n" +
"        padding-right: 0 !important;\n" +
"        padding-left: 0 !important;\n" +
"      }\n" +
"      .sectionHeader:before, \n" +
"      .sectionHeader:after {\n" +
"        margin-right: 24px;\n" +
"        margin-left: 24px;\n" +
"      }\n" +
"      .sectionHeader:before {\n" +
"      margin-right:10px;\n" +
"      }\n" +
"      .sectionHeader:after {\n" +
"      margin-left:10px;\n" +
"      }\n" +
"      #leftContactColumn li:last-child span:last-child {\n" +
"        padding-bottom: 0 !important;\n" +
"      }\n" +
"      .mobileListItems {\n" +
"        padding-left: 24px !important;\n" +
"      }\n" +
"      .properties:last-child {\n" +
"        padding-top: 4px !important;\n" +
"      }\n" +
"      .intro div:first-child {\n" +
"        width: 100% !important;\n" +
"      }\n" +
"      .intro {\n" +
"        padding-left: 24px !important;\n" +
"        padding-right: 24px !important;\n" +
"      }\n" +
"      #rightContactColumn {\n" +
"        padding-top: 16px; !important;\n" +
"      }\n" +
"      .sectionHeaderContainer {\n" +
"        width: 90% !important;\n" +
"      }\n" +
"    }\n" +
"  </style>\n" +
"</head>\n" +
"\n" +
"<body>\n" +
"  <div style=\"display:none; white-space:nowrap; font:15px courier; line-height:0;\">\n" +
"    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;\n" +
"  </div>\n" +
"  <center>\n" +
"\n" +
"    <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" height=\"100%\" width=\"100%\" id=\"bodyTable\">\n" +
"      <tr>\n" +
"        <td align=\"center\" valign=\"top\" id=\"bodyCell\">\n" +
"\n" +
"          <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"templateContainer\">\n" +
"            <tr>\n" +
"              <td valign=\"top\" id=\"templatePreheader\">\n" +
"\n" +
"                <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnTextBlock\" style=\"max-width:800px; margin: 0 auto;\">\n" +
"                  <tbody class=\"mcnTextBlockOuter\">\n" +
"                    <tr>\n" +
"                      <td valign=\"top\" class=\"mcnTextBlockInner\">\n" +
"\n" +
"                        <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"282\" class=\"mcnTextContentContainer\">\n" +
"                          <tbody>\n" +
"                            <tr>\n" +
"                              <td valign=\"top\" class=\"mcnTextContent\" style=\"padding-top:9px; padding-left:18px; padding-bottom:9px; padding-right:0;\">\n" +
"                              </td>\n" +
"                            </tr>\n" +
"                          </tbody>\n" +
"                        </table>\n" +
"\n" +
"                        <table align=\"right\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"282\" class=\"mcnTextContentContainer\">\n" +
"                          <tbody>\n" +
"                            <tr>\n" +
"                              <td valign=\"top\" class=\"mcnTextContent\" style=\"padding-top:9px; padding-right:18px; padding-bottom:9px; padding-left:18px;\">\n" +
"                                {%if content.create_page%}\n" +
"                                <div style=\"text-align: right;\"><span style=\"font-size:10px;font-family: 'Lato', sans-serif;color:rgba(0, 0, 0, .87);\">\n" +
"                                  <a href=\"{{view_as_page_url}}\" target=\"_blank\">\n" +
"            				                     <span style=\"color:rgba(0, 0, 0, .87)\">View in browser</span>{%endif%}\n" +
"                                  </a>\n" +
"                                  </span>\n" +
"                                </div>\n" +
"                              </td>\n" +
"                            </tr>\n" +
"                          </tbody>\n" +
"                        </table>\n" +
"                      </td>\n" +
"                    </tr>\n" +
"                  </tbody>\n" +
"                </table>\n" +
"              </td>\n" +
"            </tr>\n" +
"            <table style=\"max-width: 800px; box-shadow: 0 1px 6px rgba(0,0,0,0.12), 0 1px 4px rgba(0,0,0,0.12);\">\n" +
"              <tr>\n" +
"                <td valign=\"top\" id=\"templateHeader\" style=\"display: inline-block; padding-bottom: 20px;\">\n" +
"                  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnImageBlock\" style=\"min-width:100%; border-bottom: 1px solid rgba(0,0,0,.12);\">\n" +
"                    <tbody class=\"mcnImageBlockOuter\">\n" +
"                      <tr>\n" +
"                        <td valign=\"top\" style=\"padding:10px 0 0;\" class=\"mcnImageBlockInner\">\n" +
"\n" +
"                          <table align=\"left\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"mcnImageContentContainer\" style=\"min-width:100%;\">\n" +
"                            <tbody>\n" +
"                              <tr>\n" +
"                                <td class=\"mcnImageContent\" valign=\"top\" style=\"padding-right: 0px; padding-left: 0px; padding-top: 0; padding-bottom: 20px; text-align:center;\">\n" +
"                                  <a href=\"https://www.conciergeauctions.com\" target=\"_blank\">\n" +
"                                    <img align=\"center\" alt=\"\" src=\"http://web2.conciergeauctions.com/hubfs/Logos/CA-logo-header-2.jpg?noresize\" width=\"369\" style=\"width:369; margin-bottom: 20px; display: inline !important; vertical-align: bottom;\" class=\"mcnImage companyLogo\">\n" +
"                                  </a>\n" +
"                                </td>\n" +
"                              </tr>\n" +
"                            </tbody>\n" +
"                          </table>\n" +
"                        </td>\n" +
"                      </tr>\n" +
"                    </tbody>\n" +
"                  </table>\n" +
"                  \n" +
"                  \n" +
"                  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnTextBlock\" style=\"min-width:100%;\">\n" +
"                    <tbody class=\"mcnTextBlockOuter\">\n" +
"                      <tr>\n" +
"                        <td valign=\"top\" class=\"mcnTextBlockInner\">\n" +
"\n" +
"                          <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"min-width:100%;\" class=\"mcnTextContentContainer\">\n" +
"                            <tbody>\n" +
"                              <tr>\n" +
"                                <td valign=\"top\" class=\"intro\" style=\"padding-right: 36px; padding-left: 36px; padding-top: 20px; line-height: 24px;\">\n" +
"                                  <div style=\"width: 728px; text-align: left; color:rgba(0,0,0,.87);\">\n" +
"                                    <p style=\"font-size: 16px; font-family: 'Lato', sans-serif; font-weight:600;\">Hi&nbsp;{{contact.firstname}},</p>\n" +
"                                    <div>\n" +
"                                      <p style=\"font-size: 14px; font-family: 'Lato', sans-serif;\">The countdown has begun. <span style=\"color: #0091ea;\"><a href=\"https://www.conciergeauctions.com/auctions/4-berthe-circle-colorado-springs-co\" style=\"color: #0091ea;\">4 Berthe Circle</a></span> in Colorado Springs, Colorado will soon have a new owner, and it could be you. To participate in the auction, two important steps need to take place: <ul>\n" +
"                                          <li><p style=\"font-size: 14px; font-family: 'Lato', sans-serif;\">Register and place your opening bid by January 29th; and</p></li><li><p style=\"font-size: 14px; font-family: 'Lato', sans-serif;\">On January 31st , bid from anywhere in the world via the Concierge Auctions mobile bidding app. Download it here [<span style=\"color: #0091ea;\"><a href=\"https://itunes.apple.com/us/app/instant-gavel/id979968478?mt=8\" style=\"color: #0091ea;\">iPhone</a></span>] [<span style=\"color: #0091ea;\"><a href=\"https://play.google.com/store/apps/details?id=com.bidwrangler.conciergeauctions&amp;hl=en\" style=\"color: #0091ea;\">Android</a></span>].</p></li>\n" +
"                                      </ul><p style=\"font-size: 14px; font-family: 'Lato', sans-serif;\">Don't let this opportunity slip through your fingertips.</p>\n" +
"                                      <p style=\"font-size: 14px; font-family: 'Lato', sans-serif;\">If you have any questions, please feel free to contact me by phone or email. Tap. Bid. Win!</p>\n" +
"                                      <p style=\"font-family: 'Lato', sans-serif; font-weight: 600; padding-top: 15px; font-size: 14px;\">Thank you,</p>\n" +
"                                      <p style=\"font-family: 'Lato', sans-serif; font-size: 14px; margin-bottom: 15px\">Kristyn Lefebvre<br> Project Sales Manager<br><a href=\"mailto:kristyn.lefebvre@conciergeauctions.com\" style=\"color: #0091ea;\">kristyn.lefebvre@conciergeauctions.com</a> | <a href=\"tel:212.658.0940\" style=\"color: #0091ea;\">212.658.0940</a></p>\n" +
"                                        </div>\n" +
"                                      </div>\n" +
"                                    </td>\n" +
"                                  </tr>\n" +
"                                </tbody>\n" +
"                              </table>\n" +
"                            </td>\n" +
"                          </tr>\n" +
"                        </tbody>\n" +
"                      </table>\n" +
"                    </td>\n" +
"                  </tr>\n" +
"                </table>\n" +
"                <tr>\n" +
"                  <td valign=\"top\" id=\"templateFooter\" align=\"center\">\n" +
"                    <hr style=\"margin: 10px auto 25px; max-width: 800px; border: none; height: 1px; background-color: rgba(0, 0, 0, .12);\" id=\"horizontalRule\">\n" +
"\n" +
"                    <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"mcnFollowBlock\" style=\"max-width: 800px; display: inline-block;\">\n" +
"                      <tbody class=\"mcnFollowBlockOuter\">\n" +
"                        <tr>\n" +
"                          <td align=\"center\" valign=\"top\" class=\"mcnFollowBlockInner\">\n" +
"\n" +
"                            <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnFollowContentContainer\">\n" +
"                              <tbody>\n" +
"                                <tr>\n" +
"                                  <td>\n" +
"\n" +
"                                    <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"min-width:100%;\" class=\"mcnFollowContent\">\n" +
"                                      <tbody>\n" +
"                                        <tr>\n" +
"                                          <td align=\"center\" valign=\"top\">\n" +
"                                            <div style=\"display: inline-block\">\n" +
"                                              <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
"                                                <tbody>\n" +
"                                                  <tr>\n" +
"                                                    <td align=\"center\" valign=\"top\" style=\"border-right: 1px solid rgba(0,0,0,.12); padding-right: 50px;\" class=\"socialPane\">\n" +
"                                                      <div style=\"text-align: center;\"><span style=\"font-size:15px; font-family: 'Lato', sans-serif; font-weight:600; letter-spacing: 1.25px; text-transform: uppercase; line-height: 22px;\"><span class=\"shortDescription\">stay in the know</span>\n" +
"                                                        <br/>follow us on social</span>\n" +
"                                                        <br/>\n" +
"                                                      </div>\n" +
"\n" +
"                                                      <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\"  style=\"display:inline; padding-top: 15px;\" class=\"socialIcons\">\n" +
"                                                        <tbody>\n" +
"                                                          <tr>\n" +
"                                                            <td valign=\"top\" class=\"mcnFollowContentItemContainer\">\n" +
"\n" +
"                                                              <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnFollowContentItem\">\n" +
"                                                                <tbody>\n" +
"                                                                  <tr>\n" +
"                                                                    <td align=\"left\" valign=\"middle\" style=\"padding: 5px 7px;\" class=\"socialIcon\">\n" +
"\n" +
"                                                                      <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
"                                                                        <tbody>\n" +
"                                                                          <tr>\n" +
"                                                                            <td align=\"center\" valign=\"middle\" width=\"30\" class=\"mcnFollowIconContent\">\n" +
"                                                                              <a href=\"http://www.facebook.com/ConciergeAuctions\" target=\"_blank\"><img src=\"https://cdn-images.mailchimp.com/icons/social-block-v2/dark-facebook-48.png\" style=\"display:block;\" width=\"30\"></a>\n" +
"                                                                            </td>\n" +
"                                                                          </tr>\n" +
"                                                                        </tbody>\n" +
"                                                                      </table>\n" +
"                                                                    </td>\n" +
"                                                                  </tr>\n" +
"                                                                </tbody>\n" +
"                                                              </table>\n" +
"                                                            </td>\n" +
"                                                          </tr>\n" +
"                                                        </tbody>\n" +
"                                                      </table>\n" +
"\n" +
"                                                      <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"display:inline; padding-top: 15px;\" class=\"socialIcons\">\n" +
"                                                        <tbody>\n" +
"                                                          <tr>\n" +
"                                                            <td valign=\"top\" class=\"mcnFollowContentItemContainer\">\n" +
"\n" +
"                                                              <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnFollowContentItem\">\n" +
"                                                                <tbody>\n" +
"                                                                  <tr>\n" +
"                                                                    <td align=\"left\" valign=\"middle\" style=\"padding: 5px 7px;\" class=\"socialIcon\">\n" +
"\n" +
"                                                                      <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
"                                                                        <tbody>\n" +
"                                                                          <tr>\n" +
"                                                                            <td align=\"center\" valign=\"middle\" width=\"30\" class=\"mcnFollowIconContent\">\n" +
"                                                                              <a href=\"http://www.youtube.com/user/ConciergeAuctions\" target=\"_blank\"><img src=\"https://cdn-images.mailchimp.com/icons/social-block-v2/dark-youtube-48.png\" style=\"display:block;\" width=\"30\"></a>\n" +
"                                                                            </td>\n" +
"                                                                          </tr>\n" +
"                                                                        </tbody>\n" +
"                                                                      </table>\n" +
"                                                                    </td>\n" +
"                                                                  </tr>\n" +
"                                                                </tbody>\n" +
"                                                              </table>\n" +
"                                                            </td>\n" +
"                                                          </tr>\n" +
"                                                        </tbody>\n" +
"                                                      </table>\n" +
"\n" +
"                                                      <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"display:inline; padding-top: 15px;\" class=\"socialIcons\">\n" +
"                                                        <tbody>\n" +
"                                                          <tr>\n" +
"                                                            <td valign=\"top\" class=\"mcnFollowContentItemContainer\">\n" +
"\n" +
"                                                              <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnFollowContentItem\">\n" +
"                                                                <tbody>\n" +
"                                                                  <tr>\n" +
"                                                                    <td align=\"left\" valign=\"middle\" style=\"padding: 5px 7px;\" class=\"socialIcon\">\n" +
"\n" +
"                                                                      <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
"                                                                        <tbody>\n" +
"                                                                          <tr>\n" +
"                                                                            <td align=\"center\" valign=\"middle\" width=\"30\" class=\"mcnFollowIconContent\">\n" +
"                                                                              <a href=\"https://plus.google.com/114233341720328809458/posts\" target=\"_blank\"><img src=\"https://cdn-images.mailchimp.com/icons/social-block-v2/dark-googleplus-48.png\" style=\"display:block;\" width=\"30\"></a>\n" +
"                                                                            </td>\n" +
"                                                                          </tr>\n" +
"                                                                        </tbody>\n" +
"                                                                      </table>\n" +
"                                                                    </td>\n" +
"                                                                  </tr>\n" +
"                                                                </tbody>\n" +
"                                                              </table>\n" +
"                                                            </td>\n" +
"                                                          </tr>\n" +
"                                                        </tbody>\n" +
"                                                      </table>\n" +
"\n" +
"                                                      <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"display:inline; padding-top: 15px;\" class=\"socialIcons\">\n" +
"                                                        <tbody>\n" +
"                                                          <tr>\n" +
"                                                            <td valign=\"top\" class=\"mcnFollowContentItemContainer\">\n" +
"\n" +
"                                                              <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnFollowContentItem\">\n" +
"                                                                <tbody>\n" +
"                                                                  <tr>\n" +
"                                                                    <td align=\"left\" valign=\"middle\" style=\"padding: 5px 7px;\" class=\"socialIcon\">\n" +
"\n" +
"                                                                      <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
"                                                                        <tbody>\n" +
"                                                                          <tr>\n" +
"                                                                            <td align=\"center\" valign=\"middle\" width=\"30\" class=\"mcnFollowIconContent\">\n" +
"                                                                              <a href=\"http://www.linkedin.com/company/368298\" target=\"_blank\"><img src=\"https://cdn-images.mailchimp.com/icons/social-block-v2/dark-linkedin-48.png\" style=\"display:block;\" width=\"30\"></a>\n" +
"                                                                            </td>\n" +
"                                                                          </tr>\n" +
"                                                                        </tbody>\n" +
"                                                                      </table>\n" +
"                                                                    </td>\n" +
"                                                                  </tr>\n" +
"                                                                </tbody>\n" +
"                                                              </table>\n" +
"                                                            </td>\n" +
"                                                          </tr>\n" +
"                                                        </tbody>\n" +
"                                                      </table>\n" +
"\n" +
"                                                      <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"display:inline; padding-top: 15px;\" class=\"socialIcons\">\n" +
"                                                        <tbody>\n" +
"                                                          <tr>\n" +
"                                                            <td valign=\"top\" class=\"mcnFollowContentItemContainer\">\n" +
"\n" +
"                                                              <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnFollowContentItem\">\n" +
"                                                                <tbody>\n" +
"                                                                  <tr>\n" +
"                                                                    <td align=\"left\" valign=\"middle\" style=\"padding: 5px 7px;\" class=\"socialIcon\">\n" +
"\n" +
"                                                                      <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
"                                                                        <tbody>\n" +
"                                                                          <tr>\n" +
"                                                                            <td align=\"center\" valign=\"middle\" width=\"30\" class=\"mcnFollowIconContent\">\n" +
"                                                                              <a href=\"http://pinterest.com/conciergeluxury/\" target=\"_blank\"><img src=\"https://cdn-images.mailchimp.com/icons/social-block-v2/dark-pinterest-48.png\" style=\"display:block;\" width=\"30\"></a>\n" +
"                                                                            </td>\n" +
"                                                                          </tr>\n" +
"                                                                        </tbody>\n" +
"                                                                      </table>\n" +
"                                                                    </td>\n" +
"                                                                  </tr>\n" +
"                                                                </tbody>\n" +
"                                                              </table>\n" +
"                                                            </td>\n" +
"                                                          </tr>\n" +
"                                                        </tbody>\n" +
"                                                      </table>\n" +
"\n" +
"                                                      <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"display:inline; padding-top: 15px;\" class=\"socialIcons\" id=\"lastSocial\">\n" +
"                                                        <tbody>\n" +
"                                                          <tr>\n" +
"                                                            <td valign=\"top\" style=\"padding-right:0; padding-bottom:9px;\" class=\"mcnFollowContentItemContainer\">\n" +
"\n" +
"                                                              <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnFollowContentItem\">\n" +
"                                                                <tbody>\n" +
"                                                                  <tr>\n" +
"                                                                    <td align=\"left\" valign=\"middle\" style=\"padding: 5px 7px;\" class=\"socialIcon\">\n" +
"\n" +
"                                                                      <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
"                                                                        <tbody>\n" +
"                                                                          <tr>\n" +
"                                                                            <td align=\"center\" valign=\"middle\" width=\"30\" class=\"mcnFollowIconContent\">\n" +
"                                                                              <a href=\"http://instagram.com/conciergeauctions\" target=\"_blank\"><img src=\"https://cdn-images.mailchimp.com/icons/social-block-v2/dark-instagram-48.png\" style=\"display:block;\" width=\"30\"></a>\n" +
"                                                                            </td>\n" +
"                                                                          </tr>\n" +
"                                                                        </tbody>\n" +
"                                                                      </table>\n" +
"                                                                    </td>\n" +
"                                                                  </tr>\n" +
"                                                                </tbody>\n" +
"                                                              </table>\n" +
"                                                            </td>\n" +
"                                                          </tr>\n" +
"                                                        </tbody>\n" +
"                                                      </table>\n" +
"                                                    </td>\n" +
"                                                  </tr>\n" +
"                                                </tbody>\n" +
"                                              </table>\n" +
"                                            </div>\n" +
"                                            <div style=\"display: inline-block\">\n" +
"                                              <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
"                                                <tbody>\n" +
"                                                  <tr>\n" +
"                                                    <td align=\"center\" valign=\"top\" style=\"padding-left: 50px;\" class=\"socialPane\">\n" +
"                                                      <div style=\"text-align: center; padding-bottom:10px;\"><span style=\"font-size:15px; font-family: 'Lato', sans-serif; font-weight:600; letter-spacing: 1.25px; text-transform: uppercase; line-height: 22px;\"><span class=\"shortDescription\">bid &amp; watch auctions live</span>\n" +
"                                                        <br/>download our <i>instant gavel</i> app</span>\n" +
"                                                        <br/>\n" +
"                                                        <a href=\"https://itunes.apple.com/us/app/instant-gavel/id979968478?mt=8\" target=\"_blank\"><img src=\"http://web2.conciergeauctions.com/hubfs/2016/Rezora/ic_appleAppStore.png\" style=\"display:inline-block; margin-right: 10px; margin-top: 18px;\" width=\"110\"></a>\n" +
"                                                        <a href=\"https://play.google.com/store/apps/details?id=com.bidwrangler.conciergeauctions\" target=\"_blank\"><img src=\"http://web2.conciergeauctions.com/hubfs/2016/Rezora/ic_googleStore.png\" style=\"display:inline-block; margin-top: 18px;\" width=\"110\"></a>\n" +
"                                                      </div>\n" +
"                                                    </td>\n" +
"                                                  </tr>\n" +
"                                                </tbody>\n" +
"                                              </table>\n" +
"                                            </div>\n" +
"                                          </td>\n" +
"                                        </tr>\n" +
"                                      </tbody>\n" +
"                                    </table>\n" +
"                                  </td>\n" +
"                                </tr>\n" +
"                              </tbody>\n" +
"                            </table>\n" +
"                          </td>\n" +
"                        </tr>\n" +
"                      </tbody>\n" +
"                    </table>\n" +
"\n" +
"                    <hr style=\"margin: 15px auto 25px; max-width: 800px; border: none; height: 1px; background-color: rgba(0, 0, 0, .12);\">\n" +
"\n" +
"                    <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnTextBlock\" style=\"min-width:100%;\">\n" +
"                      <tbody class=\"mcnTextBlockOuter\">\n" +
"                        <tr>\n" +
"                          <td align=\"center\" valign=\"top\" class=\"mcnTextBlockInner\">\n" +
"\n" +
"                            <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"max-width: 800px;\" class=\"mcnTextContentContainer\">\n" +
"                              <tbody>\n" +
"                                <tr>\n" +
"                                  <td align=\"center\" valign=\"top\" class=\"mcnTextContent\">\n" +
"                                    <p id=\"footer\" style=\"font-family: Lato, Geneva, Verdana, Arial, Helvetica, sans-serif; text-align: center; font-size: 12px; line-height: 1em; display: block; padding: 0 50px 0 50px;\"><span style=\"font-size: 10px; color: rgba(0, 0, 0, .54);\">{{site_settings.company_name}}, {{site_settings.company_street_address_1}} {{site_settings.company_street_address_2}}, {{site_settings.company_city}}, {{site_settings.company_state}} {{site_settings.company_zip}} {{site_settings.company_country}} </span>\n" +
"                                      <br/>\n" +
"                                      <br/><span style=\"font-size: 10px; color: rgba(0, 0, 0, .54);\"> You received this email because you are subscribed to {{ subscription_name }} from {{site_settings.company_name}}. </span>\n" +
"                                      <br/>\n" +
"                                      <br/><span style=\"font-size: 10px; color: rgba(0, 0, 0, .54);\"> Update your <a target=\"_blank\" href=\"{{ unsubscribe_link }}\" style=\"text-decoration: underline; whitespace: nowrap; color:rgba(0, 0, 0, .54);\" data-unsubscribe=\"true\">email preferences</a> to choose the types of emails you receive. </span>\n" +
"                                      <br/>\n" +
"                                      <br/><span style=\"font-size: 10px; color: rgba(0, 0, 0, .54);\"> &nbsp;<a target=\"_blank\" href=\"{{ unsubscribe_link_all }}\" style=\"text-decoration: underline; whitespace: nowrap; color:rgba(0, 0, 0, .54);\" data-unsubscribe=\"true\">Unsubscribe from all future emails</a>&nbsp;</span><span style=\"color: rgba(0, 0, 0, .54);\">| </span><a href=\"http://web2.conciergeauctions.com/hubfs/2017/January%20Catalogue/4%20berthe,%20Colorado%20Springs,%20CO/colorado-springs-disclaimer.jpg\" style=\"text-decoration: underline; whitespace: nowrap; font-size:10px; color:rgba(0, 0, 0, .54);\" target=\"_blank\">Disclaimer</a></p>\n" +
"                                  </td>\n" +
"                                </tr>\n" +
"                              </tbody>\n" +
"                            </table>\n" +
"                          </td>\n" +
"                        </tr>\n" +
"                      </tbody>\n" +
"                    </table>\n" +
"                  </td>\n" +
"                </tr>\n" +
"              </table>\n" +
"            </td>\n" +
"          </tr>\n" +
"        </table>\n" +
"      </center>\n" +
"    </body>\n" +
"\n" +
"    </html>\n" +
"";
              
              
              String html1=html.replace("4 Berthe Circle",propertyname);
              String html2=html1.replace("https://www.conciergeauctions.com/auctions/4-berthe-circle-colorado-springs-co",url);
              String html3=html2.replace("Colorado Springs, Colorado",location);
              String html4=html3.replace("January 29th",registerdate);
              String html5=html4.replace("January 31st ",auctiondate);
              String html6=html5.replace("Kristyn Lefebvre",psm);
              String html7=html6.replace(" Project Sales Manager",title);
              String html8=html7.replace("kristyn.lefebvre@conciergeauctions.com",email);
              String html9=html8.replace("212.658.0940",phone);
              String finalhtml=html9.replace("http://web2.conciergeauctions.com/hubfs/2017/January%20Catalogue/4%20berthe,%20Colorado%20Springs,%20CO/colorado-springs-disclaimer.jpg",disclamier);
              
              
              
             return finalhtml;
    }

}

