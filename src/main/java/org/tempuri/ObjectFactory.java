
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import org.datacontract.schemas._2004._07.livemediastructs.ActorStruct;
import org.datacontract.schemas._2004._07.livemediastructs.ArrayOfDayRankingStruct;
import org.datacontract.schemas._2004._07.livemediastructs.ArrayOfDayScoringStruct;
import org.datacontract.schemas._2004._07.livemediastructs.ArrayOfMatchFilActionLightStruct;
import org.datacontract.schemas._2004._07.livemediastructs.ArrayOfMatchFilActionStruct;
import org.datacontract.schemas._2004._07.livemediastructs.ArrayOfMatchLightStruct;
import org.datacontract.schemas._2004._07.livemediastructs.ArrayOfMatchStruct;
import org.datacontract.schemas._2004._07.livemediastructs.MatchFilActionStruct;
import org.datacontract.schemas._2004._07.livemediastructs.MatchStruct;
import org.datacontract.schemas._2004._07.livemediastructs.TeamStruct;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetMatchStructDetailAvailableResponseGetMatchStructDetailAvailableResult_QNAME = new QName("http://tempuri.org/", "GetMatchStructDetailAvailableResult");
    private final static QName _GetActorStructResponseGetActorStructResult_QNAME = new QName("http://tempuri.org/", "GetActorStructResult");
    private final static QName _LfpGetMatchOldXmlContentCResponseLfpGetMatchOldXmlContentCResult_QNAME = new QName("http://tempuri.org/", "LfpGetMatchOldXmlContentCResult");
    private final static QName _GetDayScoringStructDetailAvailableResponseGetDayScoringStructDetailAvailableResult_QNAME = new QName("http://tempuri.org/", "GetDayScoringStructDetailAvailableResult");
    private final static QName _ServiceVersionResponseServiceVersionResult_QNAME = new QName("http://tempuri.org/", "ServiceVersionResult");
    private final static QName _MatchLightStructListResponseMatchLightStructListResult_QNAME = new QName("http://tempuri.org/", "MatchLightStructListResult");
    private final static QName _GetMatchStructResponseGetMatchStructResult_QNAME = new QName("http://tempuri.org/", "GetMatchStructResult");
    private final static QName _GetMatchStructListResponseGetMatchStructListResult_QNAME = new QName("http://tempuri.org/", "GetMatchStructListResult");
    private final static QName _GetMatchFilActionStructListIdMatch_QNAME = new QName("http://tempuri.org/", "idMatch");
    private final static QName _GetDayRankingStructDetailAvailableResponseGetDayRankingStructDetailAvailableResult_QNAME = new QName("http://tempuri.org/", "GetDayRankingStructDetailAvailableResult");
    private final static QName _GetMatchFilActionStructListResponseGetMatchFilActionStructListResult_QNAME = new QName("http://tempuri.org/", "GetMatchFilActionStructListResult");
    private final static QName _GetMatchFilActionStructResponseGetMatchFilActionStructResult_QNAME = new QName("http://tempuri.org/", "GetMatchFilActionStructResult");
    private final static QName _DayScoringStructListResponseDayScoringStructListResult_QNAME = new QName("http://tempuri.org/", "DayScoringStructListResult");
    private final static QName _MatchFilActionLightStructListResponseMatchFilActionLightStructListResult_QNAME = new QName("http://tempuri.org/", "MatchFilActionLightStructListResult");
    private final static QName _GetMatchFilActionStructDetailAvailableResponseGetMatchFilActionStructDetailAvailableResult_QNAME = new QName("http://tempuri.org/", "GetMatchFilActionStructDetailAvailableResult");
    private final static QName _GetTeamStructResponseGetTeamStructResult_QNAME = new QName("http://tempuri.org/", "GetTeamStructResult");
    private final static QName _GetMatchStructListIdMatchList_QNAME = new QName("http://tempuri.org/", "idMatchList");
    private final static QName _DayRankingStructListResponseDayRankingStructListResult_QNAME = new QName("http://tempuri.org/", "DayRankingStructListResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMatchFilActionStructDetailAvailable }
     * 
     */
    public GetMatchFilActionStructDetailAvailable createGetMatchFilActionStructDetailAvailable() {
        return new GetMatchFilActionStructDetailAvailable();
    }

    /**
     * Create an instance of {@link DayRankingStructList }
     * 
     */
    public DayRankingStructList createDayRankingStructList() {
        return new DayRankingStructList();
    }

    /**
     * Create an instance of {@link GetMatchStructList }
     * 
     */
    public GetMatchStructList createGetMatchStructList() {
        return new GetMatchStructList();
    }

    /**
     * Create an instance of {@link DayScoringStructListResponse }
     * 
     */
    public DayScoringStructListResponse createDayScoringStructListResponse() {
        return new DayScoringStructListResponse();
    }

    /**
     * Create an instance of {@link MatchFilActionLightStructList }
     * 
     */
    public MatchFilActionLightStructList createMatchFilActionLightStructList() {
        return new MatchFilActionLightStructList();
    }

    /**
     * Create an instance of {@link DayScoringStructList }
     * 
     */
    public DayScoringStructList createDayScoringStructList() {
        return new DayScoringStructList();
    }

    /**
     * Create an instance of {@link MatchLightStructList }
     * 
     */
    public MatchLightStructList createMatchLightStructList() {
        return new MatchLightStructList();
    }

    /**
     * Create an instance of {@link GetDayScoringStructDetailAvailable }
     * 
     */
    public GetDayScoringStructDetailAvailable createGetDayScoringStructDetailAvailable() {
        return new GetDayScoringStructDetailAvailable();
    }

    /**
     * Create an instance of {@link GetMatchStructResponse }
     * 
     */
    public GetMatchStructResponse createGetMatchStructResponse() {
        return new GetMatchStructResponse();
    }

    /**
     * Create an instance of {@link GetMatchStructDetailAvailableResponse }
     * 
     */
    public GetMatchStructDetailAvailableResponse createGetMatchStructDetailAvailableResponse() {
        return new GetMatchStructDetailAvailableResponse();
    }

    /**
     * Create an instance of {@link MatchLightStructListResponse }
     * 
     */
    public MatchLightStructListResponse createMatchLightStructListResponse() {
        return new MatchLightStructListResponse();
    }

    /**
     * Create an instance of {@link LfpGetMatchOldXmlContentC }
     * 
     */
    public LfpGetMatchOldXmlContentC createLfpGetMatchOldXmlContentC() {
        return new LfpGetMatchOldXmlContentC();
    }

    /**
     * Create an instance of {@link GetTeamStructResponse }
     * 
     */
    public GetTeamStructResponse createGetTeamStructResponse() {
        return new GetTeamStructResponse();
    }

    /**
     * Create an instance of {@link ServiceVersionResponse }
     * 
     */
    public ServiceVersionResponse createServiceVersionResponse() {
        return new ServiceVersionResponse();
    }

    /**
     * Create an instance of {@link IsReadyResponse }
     * 
     */
    public IsReadyResponse createIsReadyResponse() {
        return new IsReadyResponse();
    }

    /**
     * Create an instance of {@link GetMatchStruct }
     * 
     */
    public GetMatchStruct createGetMatchStruct() {
        return new GetMatchStruct();
    }

    /**
     * Create an instance of {@link LfpGetMatchOldXmlContentCResponse }
     * 
     */
    public LfpGetMatchOldXmlContentCResponse createLfpGetMatchOldXmlContentCResponse() {
        return new LfpGetMatchOldXmlContentCResponse();
    }

    /**
     * Create an instance of {@link GetMatchStructDetailAvailable }
     * 
     */
    public GetMatchStructDetailAvailable createGetMatchStructDetailAvailable() {
        return new GetMatchStructDetailAvailable();
    }

    /**
     * Create an instance of {@link GetMatchFilActionStructDetailAvailableResponse }
     * 
     */
    public GetMatchFilActionStructDetailAvailableResponse createGetMatchFilActionStructDetailAvailableResponse() {
        return new GetMatchFilActionStructDetailAvailableResponse();
    }

    /**
     * Create an instance of {@link MatchFilActionLightStructListResponse }
     * 
     */
    public MatchFilActionLightStructListResponse createMatchFilActionLightStructListResponse() {
        return new MatchFilActionLightStructListResponse();
    }

    /**
     * Create an instance of {@link GetDayScoringStructDetailAvailableResponse }
     * 
     */
    public GetDayScoringStructDetailAvailableResponse createGetDayScoringStructDetailAvailableResponse() {
        return new GetDayScoringStructDetailAvailableResponse();
    }

    /**
     * Create an instance of {@link GetMatchFilActionStruct }
     * 
     */
    public GetMatchFilActionStruct createGetMatchFilActionStruct() {
        return new GetMatchFilActionStruct();
    }

    /**
     * Create an instance of {@link ServiceVersion }
     * 
     */
    public ServiceVersion createServiceVersion() {
        return new ServiceVersion();
    }

    /**
     * Create an instance of {@link GetMatchStructListResponse }
     * 
     */
    public GetMatchStructListResponse createGetMatchStructListResponse() {
        return new GetMatchStructListResponse();
    }

    /**
     * Create an instance of {@link GetTeamStruct }
     * 
     */
    public GetTeamStruct createGetTeamStruct() {
        return new GetTeamStruct();
    }

    /**
     * Create an instance of {@link GetMatchFilActionStructResponse }
     * 
     */
    public GetMatchFilActionStructResponse createGetMatchFilActionStructResponse() {
        return new GetMatchFilActionStructResponse();
    }

    /**
     * Create an instance of {@link GetDayRankingStructDetailAvailable }
     * 
     */
    public GetDayRankingStructDetailAvailable createGetDayRankingStructDetailAvailable() {
        return new GetDayRankingStructDetailAvailable();
    }

    /**
     * Create an instance of {@link GetActorStructResponse }
     * 
     */
    public GetActorStructResponse createGetActorStructResponse() {
        return new GetActorStructResponse();
    }

    /**
     * Create an instance of {@link GetMatchFilActionStructList }
     * 
     */
    public GetMatchFilActionStructList createGetMatchFilActionStructList() {
        return new GetMatchFilActionStructList();
    }

    /**
     * Create an instance of {@link GetActorStruct }
     * 
     */
    public GetActorStruct createGetActorStruct() {
        return new GetActorStruct();
    }

    /**
     * Create an instance of {@link GetMatchFilActionStructListResponse }
     * 
     */
    public GetMatchFilActionStructListResponse createGetMatchFilActionStructListResponse() {
        return new GetMatchFilActionStructListResponse();
    }

    /**
     * Create an instance of {@link IsReady }
     * 
     */
    public IsReady createIsReady() {
        return new IsReady();
    }

    /**
     * Create an instance of {@link GetDayRankingStructDetailAvailableResponse }
     * 
     */
    public GetDayRankingStructDetailAvailableResponse createGetDayRankingStructDetailAvailableResponse() {
        return new GetDayRankingStructDetailAvailableResponse();
    }

    /**
     * Create an instance of {@link DayRankingStructListResponse }
     * 
     */
    public DayRankingStructListResponse createDayRankingStructListResponse() {
        return new DayRankingStructListResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetMatchStructDetailAvailableResult", scope = GetMatchStructDetailAvailableResponse.class)
    public JAXBElement<ArrayOfKeyValueOfintstring> createGetMatchStructDetailAvailableResponseGetMatchStructDetailAvailableResult(ArrayOfKeyValueOfintstring value) {
        return new JAXBElement<ArrayOfKeyValueOfintstring>(_GetMatchStructDetailAvailableResponseGetMatchStructDetailAvailableResult_QNAME, ArrayOfKeyValueOfintstring.class, GetMatchStructDetailAvailableResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActorStruct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetActorStructResult", scope = GetActorStructResponse.class)
    public JAXBElement<ActorStruct> createGetActorStructResponseGetActorStructResult(ActorStruct value) {
        return new JAXBElement<ActorStruct>(_GetActorStructResponseGetActorStructResult_QNAME, ActorStruct.class, GetActorStructResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "LfpGetMatchOldXmlContentCResult", scope = LfpGetMatchOldXmlContentCResponse.class)
    public JAXBElement<String> createLfpGetMatchOldXmlContentCResponseLfpGetMatchOldXmlContentCResult(String value) {
        return new JAXBElement<String>(_LfpGetMatchOldXmlContentCResponseLfpGetMatchOldXmlContentCResult_QNAME, String.class, LfpGetMatchOldXmlContentCResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetDayScoringStructDetailAvailableResult", scope = GetDayScoringStructDetailAvailableResponse.class)
    public JAXBElement<ArrayOfKeyValueOfintstring> createGetDayScoringStructDetailAvailableResponseGetDayScoringStructDetailAvailableResult(ArrayOfKeyValueOfintstring value) {
        return new JAXBElement<ArrayOfKeyValueOfintstring>(_GetDayScoringStructDetailAvailableResponseGetDayScoringStructDetailAvailableResult_QNAME, ArrayOfKeyValueOfintstring.class, GetDayScoringStructDetailAvailableResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceVersionResult", scope = ServiceVersionResponse.class)
    public JAXBElement<String> createServiceVersionResponseServiceVersionResult(String value) {
        return new JAXBElement<String>(_ServiceVersionResponseServiceVersionResult_QNAME, String.class, ServiceVersionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMatchLightStruct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "MatchLightStructListResult", scope = MatchLightStructListResponse.class)
    public JAXBElement<ArrayOfMatchLightStruct> createMatchLightStructListResponseMatchLightStructListResult(ArrayOfMatchLightStruct value) {
        return new JAXBElement<ArrayOfMatchLightStruct>(_MatchLightStructListResponseMatchLightStructListResult_QNAME, ArrayOfMatchLightStruct.class, MatchLightStructListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatchStruct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetMatchStructResult", scope = GetMatchStructResponse.class)
    public JAXBElement<MatchStruct> createGetMatchStructResponseGetMatchStructResult(MatchStruct value) {
        return new JAXBElement<MatchStruct>(_GetMatchStructResponseGetMatchStructResult_QNAME, MatchStruct.class, GetMatchStructResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMatchStruct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetMatchStructListResult", scope = GetMatchStructListResponse.class)
    public JAXBElement<ArrayOfMatchStruct> createGetMatchStructListResponseGetMatchStructListResult(ArrayOfMatchStruct value) {
        return new JAXBElement<ArrayOfMatchStruct>(_GetMatchStructListResponseGetMatchStructListResult_QNAME, ArrayOfMatchStruct.class, GetMatchStructListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "idMatch", scope = GetMatchFilActionStructList.class)
    public JAXBElement<ArrayOfint> createGetMatchFilActionStructListIdMatch(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetMatchFilActionStructListIdMatch_QNAME, ArrayOfint.class, GetMatchFilActionStructList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetDayRankingStructDetailAvailableResult", scope = GetDayRankingStructDetailAvailableResponse.class)
    public JAXBElement<ArrayOfKeyValueOfintstring> createGetDayRankingStructDetailAvailableResponseGetDayRankingStructDetailAvailableResult(ArrayOfKeyValueOfintstring value) {
        return new JAXBElement<ArrayOfKeyValueOfintstring>(_GetDayRankingStructDetailAvailableResponseGetDayRankingStructDetailAvailableResult_QNAME, ArrayOfKeyValueOfintstring.class, GetDayRankingStructDetailAvailableResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMatchFilActionStruct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetMatchFilActionStructListResult", scope = GetMatchFilActionStructListResponse.class)
    public JAXBElement<ArrayOfMatchFilActionStruct> createGetMatchFilActionStructListResponseGetMatchFilActionStructListResult(ArrayOfMatchFilActionStruct value) {
        return new JAXBElement<ArrayOfMatchFilActionStruct>(_GetMatchFilActionStructListResponseGetMatchFilActionStructListResult_QNAME, ArrayOfMatchFilActionStruct.class, GetMatchFilActionStructListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatchFilActionStruct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetMatchFilActionStructResult", scope = GetMatchFilActionStructResponse.class)
    public JAXBElement<MatchFilActionStruct> createGetMatchFilActionStructResponseGetMatchFilActionStructResult(MatchFilActionStruct value) {
        return new JAXBElement<MatchFilActionStruct>(_GetMatchFilActionStructResponseGetMatchFilActionStructResult_QNAME, MatchFilActionStruct.class, GetMatchFilActionStructResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDayScoringStruct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DayScoringStructListResult", scope = DayScoringStructListResponse.class)
    public JAXBElement<ArrayOfDayScoringStruct> createDayScoringStructListResponseDayScoringStructListResult(ArrayOfDayScoringStruct value) {
        return new JAXBElement<ArrayOfDayScoringStruct>(_DayScoringStructListResponseDayScoringStructListResult_QNAME, ArrayOfDayScoringStruct.class, DayScoringStructListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMatchFilActionLightStruct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "MatchFilActionLightStructListResult", scope = MatchFilActionLightStructListResponse.class)
    public JAXBElement<ArrayOfMatchFilActionLightStruct> createMatchFilActionLightStructListResponseMatchFilActionLightStructListResult(ArrayOfMatchFilActionLightStruct value) {
        return new JAXBElement<ArrayOfMatchFilActionLightStruct>(_MatchFilActionLightStructListResponseMatchFilActionLightStructListResult_QNAME, ArrayOfMatchFilActionLightStruct.class, MatchFilActionLightStructListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetMatchFilActionStructDetailAvailableResult", scope = GetMatchFilActionStructDetailAvailableResponse.class)
    public JAXBElement<ArrayOfKeyValueOfintstring> createGetMatchFilActionStructDetailAvailableResponseGetMatchFilActionStructDetailAvailableResult(ArrayOfKeyValueOfintstring value) {
        return new JAXBElement<ArrayOfKeyValueOfintstring>(_GetMatchFilActionStructDetailAvailableResponseGetMatchFilActionStructDetailAvailableResult_QNAME, ArrayOfKeyValueOfintstring.class, GetMatchFilActionStructDetailAvailableResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TeamStruct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetTeamStructResult", scope = GetTeamStructResponse.class)
    public JAXBElement<TeamStruct> createGetTeamStructResponseGetTeamStructResult(TeamStruct value) {
        return new JAXBElement<TeamStruct>(_GetTeamStructResponseGetTeamStructResult_QNAME, TeamStruct.class, GetTeamStructResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "idMatchList", scope = GetMatchStructList.class)
    public JAXBElement<ArrayOfint> createGetMatchStructListIdMatchList(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetMatchStructListIdMatchList_QNAME, ArrayOfint.class, GetMatchStructList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDayRankingStruct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DayRankingStructListResult", scope = DayRankingStructListResponse.class)
    public JAXBElement<ArrayOfDayRankingStruct> createDayRankingStructListResponseDayRankingStructListResult(ArrayOfDayRankingStruct value) {
        return new JAXBElement<ArrayOfDayRankingStruct>(_DayRankingStructListResponseDayRankingStructListResult_QNAME, ArrayOfDayRankingStruct.class, DayRankingStructListResponse.class, value);
    }

}
