import jakarta.data.repository.Find
import jakarta.data.repository.Repository
import jakarta.persistence.Entity
import jakarta.persistence.Id
import org.hibernate.annotations.NaturalId

@Entity
class MyEntity(
    @Id
    val id: String,

    @NaturalId
    val naturalId: String
)

@Repository
interface EntityRepository {

    @Find
    fun byNaturalId(naturalId: String): MyEntity
}
